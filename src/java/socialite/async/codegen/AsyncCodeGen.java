package socialite.async.codegen;

import com.intellij.util.containers.ConcurrentHashMap;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import socialite.async.AsyncConfig;
import socialite.async.analysis.AsyncAnalysis;
import socialite.util.MySTGroupFile;

public class AsyncCodeGen {
    private AsyncAnalysis asyncAn;
    private AsyncConfig asyncConfig = AsyncConfig.get();

    public AsyncCodeGen(AsyncAnalysis asyncAn) {
        this.asyncAn = asyncAn;
    }

    String generateMessageTable() {
        STGroup stg = new MySTGroupFile(AsyncCodeGen.class.getResource("MessageTable.stg"),
                "UTF-8", '<', '>');
        stg.load();
        ST st = stg.getInstanceOf("MessageTable");
        st.add("keyType", asyncAn.getKeyType());
        st.add("deltaType", asyncAn.getDeltaType());
        st.add("aggrType", asyncAn.getAggrName());
        return st.render();
    }

    String generateAsyncTable() {
        STGroup stg = new MySTGroupFile(AsyncCodeGen.class.getResource("AsyncTable.stg"),
                "UTF-8", '<', '>');
        stg.load();
        ST st = stg.getInstanceOf("AsyncTableSharedMem");
        st.add("name", asyncAn.getResultPName());
        st.add("keyType", asyncAn.getKeyType());
        st.add("deltaType", asyncAn.getDeltaType());
        st.add("valueType", asyncAn.getValueType());
        st.add("aggrType", asyncAn.getAggrName());
        st.add("weightType", asyncAn.getWeightType());
        st.add("extraType", asyncAn.getExtraType());
        st.add("expr", asyncAn.getsExpr());
        st.add("dynamic", asyncConfig.isDynamic());
        st.add("sync", asyncConfig.isSync());
        if (asyncAn.getKeyType().equals("int") && !asyncConfig.isDynamic())
            st.add("keyAsIndex", true);
        return st.render();
    }

    String generateDistAsyncTable() {
        STGroup stg = new MySTGroupFile(AsyncCodeGen.class.getResource("AsyncTable.stg"),
                "UTF-8", '<', '>');
        stg.load();
        ST st = stg.getInstanceOf("DistAsyncTable");
        st.add("name", asyncAn.getResultPName());
        st.add("dynamic", asyncConfig.isDynamic());
        st.add("keyType", asyncAn.getKeyType());
        st.add("valueType", asyncAn.getValueType());
        st.add("deltaType", asyncAn.getDeltaType());
        st.add("aggrType", asyncAn.getAggrName());
        st.add("weightType", asyncAn.getWeightType());
        st.add("extraType", asyncAn.getExtraType());
        st.add("expr", asyncAn.getsExpr());
        st.add("sync", asyncConfig.isSync());
        return st.render();
    }
}
