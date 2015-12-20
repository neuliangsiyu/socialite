/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package socialite.rpc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-15")
public class LongCol implements org.apache.thrift.TBase<LongCol, LongCol._Fields>, java.io.Serializable, Cloneable, Comparable<LongCol> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LongCol");

  private static final org.apache.thrift.protocol.TField COL_FIELD_DESC = new org.apache.thrift.protocol.TField("col", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LongColStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LongColTupleSchemeFactory());
  }

  public List<Long> col; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL((short)1, "col");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COL
          return COL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL, new org.apache.thrift.meta_data.FieldMetaData("col", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LongCol.class, metaDataMap);
  }

  public LongCol() {
  }

  public LongCol(
    List<Long> col)
  {
    this();
    this.col = col;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LongCol(LongCol other) {
    if (other.isSetCol()) {
      List<Long> __this__col = new ArrayList<Long>(other.col);
      this.col = __this__col;
    }
  }

  public LongCol deepCopy() {
    return new LongCol(this);
  }

  @Override
  public void clear() {
    this.col = null;
  }

  public int getColSize() {
    return (this.col == null) ? 0 : this.col.size();
  }

  public java.util.Iterator<Long> getColIterator() {
    return (this.col == null) ? null : this.col.iterator();
  }

  public void addToCol(long elem) {
    if (this.col == null) {
      this.col = new ArrayList<Long>();
    }
    this.col.add(elem);
  }

  public List<Long> getCol() {
    return this.col;
  }

  public LongCol setCol(List<Long> col) {
    this.col = col;
    return this;
  }

  public void unsetCol() {
    this.col = null;
  }

  /** Returns true if field col is set (has been assigned a value) and false otherwise */
  public boolean isSetCol() {
    return this.col != null;
  }

  public void setColIsSet(boolean value) {
    if (!value) {
      this.col = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COL:
      if (value == null) {
        unsetCol();
      } else {
        setCol((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COL:
      return getCol();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COL:
      return isSetCol();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LongCol)
      return this.equals((LongCol)that);
    return false;
  }

  public boolean equals(LongCol that) {
    if (that == null)
      return false;

    boolean this_present_col = true && this.isSetCol();
    boolean that_present_col = true && that.isSetCol();
    if (this_present_col || that_present_col) {
      if (!(this_present_col && that_present_col))
        return false;
      if (!this.col.equals(that.col))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_col = true && (isSetCol());
    list.add(present_col);
    if (present_col)
      list.add(col);

    return list.hashCode();
  }

  @Override
  public int compareTo(LongCol other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCol()).compareTo(other.isSetCol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.col, other.col);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LongCol(");
    boolean first = true;

    sb.append("col:");
    if (this.col == null) {
      sb.append("null");
    } else {
      sb.append(this.col);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LongColStandardSchemeFactory implements SchemeFactory {
    public LongColStandardScheme getScheme() {
      return new LongColStandardScheme();
    }
  }

  private static class LongColStandardScheme extends StandardScheme<LongCol> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LongCol struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.col = new ArrayList<Long>(_list18.size);
                long _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = iprot.readI64();
                  struct.col.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setColIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LongCol struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.col != null) {
        oprot.writeFieldBegin(COL_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.col.size()));
          for (long _iter21 : struct.col)
          {
            oprot.writeI64(_iter21);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LongColTupleSchemeFactory implements SchemeFactory {
    public LongColTupleScheme getScheme() {
      return new LongColTupleScheme();
    }
  }

  private static class LongColTupleScheme extends TupleScheme<LongCol> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LongCol struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCol()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCol()) {
        {
          oprot.writeI32(struct.col.size());
          for (long _iter22 : struct.col)
          {
            oprot.writeI64(_iter22);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LongCol struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.col = new ArrayList<Long>(_list23.size);
          long _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = iprot.readI64();
            struct.col.add(_elem24);
          }
        }
        struct.setColIsSet(true);
      }
    }
  }

}

