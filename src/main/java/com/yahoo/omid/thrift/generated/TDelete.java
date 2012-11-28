/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yahoo.omid.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Used to perform Delete operations on a single row.
 * 
 * The scope can be further narrowed down by specifying a list of
 * columns or column families as TColumns.
 * 
 * Specifying only a family in a TColumn will delete the whole family.
 * If a timestamp is specified all versions with a timestamp less than
 * or equal to this will be deleted. If no timestamp is specified the
 * current time will be used.
 * 
 * Specifying a family and a column qualifier in a TColumn will delete only
 * this qualifier. If a timestamp is specified only versions equal
 * to this timestamp will be deleted. If no timestamp is specified the
 * most recent version will be deleted.  To delete all previous versions,
 * specify the DELETE_COLUMNS TDeleteType.
 * 
 * The top level timestamp is only used if a complete row should be deleted
 * (i.e. no columns are passed) and if it is specified it works the same way
 * as if you had added a TColumn for every column family and this timestamp
 * (i.e. all versions older than or equal in all column families will be deleted)
 * 
 */
public class TDelete implements org.apache.thrift.TBase<TDelete, TDelete._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDelete");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DELETE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("deleteType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField WRITE_TO_WAL_FIELD_DESC = new org.apache.thrift.protocol.TField("writeToWal", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDeleteStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDeleteTupleSchemeFactory());
  }

  public ByteBuffer row; // required
  public List<TColumn> columns; // optional
  /**
   * 
   * @see TDeleteType
   */
  public TDeleteType deleteType; // optional
  public boolean writeToWal; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMNS((short)2, "columns"),
    /**
     * 
     * @see TDeleteType
     */
    DELETE_TYPE((short)3, "deleteType"),
    WRITE_TO_WAL((short)4, "writeToWal");

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
        case 1: // ROW
          return ROW;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // DELETE_TYPE
          return DELETE_TYPE;
        case 4: // WRITE_TO_WAL
          return WRITE_TO_WAL;
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
  private static final int __WRITETOWAL_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.COLUMNS,_Fields.DELETE_TYPE,_Fields.WRITE_TO_WAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumn.class))));
    tmpMap.put(_Fields.DELETE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("deleteType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDeleteType.class)));
    tmpMap.put(_Fields.WRITE_TO_WAL, new org.apache.thrift.meta_data.FieldMetaData("writeToWal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDelete.class, metaDataMap);
  }

  public TDelete() {
    this.deleteType = com.yahoo.omid.thrift.generated.TDeleteType.DELETE_COLUMNS;

    this.writeToWal = true;

  }

  public TDelete(
    ByteBuffer row)
  {
    this();
    this.row = row;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDelete(TDelete other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
;
    }
    if (other.isSetColumns()) {
      List<TColumn> __this__columns = new ArrayList<TColumn>();
      for (TColumn other_element : other.columns) {
        __this__columns.add(new TColumn(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetDeleteType()) {
      this.deleteType = other.deleteType;
    }
    this.writeToWal = other.writeToWal;
  }

  public TDelete deepCopy() {
    return new TDelete(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columns = null;
    this.deleteType = com.yahoo.omid.thrift.generated.TDeleteType.DELETE_COLUMNS;

    this.writeToWal = true;

  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return row;
  }

  public TDelete setRow(byte[] row) {
    setRow(row == null ? (ByteBuffer)null : ByteBuffer.wrap(row));
    return this;
  }

  public TDelete setRow(ByteBuffer row) {
    this.row = row;
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<TColumn> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(TColumn elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<TColumn>();
    }
    this.columns.add(elem);
  }

  public List<TColumn> getColumns() {
    return this.columns;
  }

  public TDelete setColumns(List<TColumn> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  /**
   * 
   * @see TDeleteType
   */
  public TDeleteType getDeleteType() {
    return this.deleteType;
  }

  /**
   * 
   * @see TDeleteType
   */
  public TDelete setDeleteType(TDeleteType deleteType) {
    this.deleteType = deleteType;
    return this;
  }

  public void unsetDeleteType() {
    this.deleteType = null;
  }

  /** Returns true if field deleteType is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteType() {
    return this.deleteType != null;
  }

  public void setDeleteTypeIsSet(boolean value) {
    if (!value) {
      this.deleteType = null;
    }
  }

  public boolean isWriteToWal() {
    return this.writeToWal;
  }

  public TDelete setWriteToWal(boolean writeToWal) {
    this.writeToWal = writeToWal;
    setWriteToWalIsSet(true);
    return this;
  }

  public void unsetWriteToWal() {
    __isset_bit_vector.clear(__WRITETOWAL_ISSET_ID);
  }

  /** Returns true if field writeToWal is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteToWal() {
    return __isset_bit_vector.get(__WRITETOWAL_ISSET_ID);
  }

  public void setWriteToWalIsSet(boolean value) {
    __isset_bit_vector.set(__WRITETOWAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        setRow((ByteBuffer)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<TColumn>)value);
      }
      break;

    case DELETE_TYPE:
      if (value == null) {
        unsetDeleteType();
      } else {
        setDeleteType((TDeleteType)value);
      }
      break;

    case WRITE_TO_WAL:
      if (value == null) {
        unsetWriteToWal();
      } else {
        setWriteToWal((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMNS:
      return getColumns();

    case DELETE_TYPE:
      return getDeleteType();

    case WRITE_TO_WAL:
      return Boolean.valueOf(isWriteToWal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMNS:
      return isSetColumns();
    case DELETE_TYPE:
      return isSetDeleteType();
    case WRITE_TO_WAL:
      return isSetWriteToWal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDelete)
      return this.equals((TDelete)that);
    return false;
  }

  public boolean equals(TDelete that) {
    if (that == null)
      return false;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_deleteType = true && this.isSetDeleteType();
    boolean that_present_deleteType = true && that.isSetDeleteType();
    if (this_present_deleteType || that_present_deleteType) {
      if (!(this_present_deleteType && that_present_deleteType))
        return false;
      if (!this.deleteType.equals(that.deleteType))
        return false;
    }

    boolean this_present_writeToWal = true && this.isSetWriteToWal();
    boolean that_present_writeToWal = true && that.isSetWriteToWal();
    if (this_present_writeToWal || that_present_writeToWal) {
      if (!(this_present_writeToWal && that_present_writeToWal))
        return false;
      if (this.writeToWal != that.writeToWal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TDelete other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TDelete typedOther = (TDelete)other;

    lastComparison = Boolean.valueOf(isSetRow()).compareTo(typedOther.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, typedOther.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteType()).compareTo(typedOther.isSetDeleteType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleteType, typedOther.deleteType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteToWal()).compareTo(typedOther.isSetWriteToWal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteToWal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeToWal, typedOther.writeToWal);
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
    StringBuilder sb = new StringBuilder("TDelete(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetDeleteType()) {
      if (!first) sb.append(", ");
      sb.append("deleteType:");
      if (this.deleteType == null) {
        sb.append("null");
      } else {
        sb.append(this.deleteType);
      }
      first = false;
    }
    if (isSetWriteToWal()) {
      if (!first) sb.append(", ");
      sb.append("writeToWal:");
      sb.append(this.writeToWal);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (row == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row' was not present! Struct: " + toString());
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDeleteStandardSchemeFactory implements SchemeFactory {
    public TDeleteStandardScheme getScheme() {
      return new TDeleteStandardScheme();
    }
  }

  private static class TDeleteStandardScheme extends StandardScheme<TDelete> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDelete struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.columns = new ArrayList<TColumn>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  TColumn _elem34; // required
                  _elem34 = new TColumn();
                  _elem34.read(iprot);
                  struct.columns.add(_elem34);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DELETE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.deleteType = TDeleteType.findByValue(iprot.readI32());
              struct.setDeleteTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WRITE_TO_WAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.writeToWal = iprot.readBool();
              struct.setWriteToWalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDelete struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
            for (TColumn _iter35 : struct.columns)
            {
              _iter35.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.deleteType != null) {
        if (struct.isSetDeleteType()) {
          oprot.writeFieldBegin(DELETE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.deleteType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWriteToWal()) {
        oprot.writeFieldBegin(WRITE_TO_WAL_FIELD_DESC);
        oprot.writeBool(struct.writeToWal);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDeleteTupleSchemeFactory implements SchemeFactory {
    public TDeleteTupleScheme getScheme() {
      return new TDeleteTupleScheme();
    }
  }

  private static class TDeleteTupleScheme extends TupleScheme<TDelete> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDelete struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.row);
      BitSet optionals = new BitSet();
      if (struct.isSetColumns()) {
        optionals.set(0);
      }
      if (struct.isSetDeleteType()) {
        optionals.set(1);
      }
      if (struct.isSetWriteToWal()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (TColumn _iter36 : struct.columns)
          {
            _iter36.write(oprot);
          }
        }
      }
      if (struct.isSetDeleteType()) {
        oprot.writeI32(struct.deleteType.getValue());
      }
      if (struct.isSetWriteToWal()) {
        oprot.writeBool(struct.writeToWal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDelete struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.row = iprot.readBinary();
      struct.setRowIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.columns = new ArrayList<TColumn>(_list37.size);
          for (int _i38 = 0; _i38 < _list37.size; ++_i38)
          {
            TColumn _elem39; // required
            _elem39 = new TColumn();
            _elem39.read(iprot);
            struct.columns.add(_elem39);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.deleteType = TDeleteType.findByValue(iprot.readI32());
        struct.setDeleteTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.writeToWal = iprot.readBool();
        struct.setWriteToWalIsSet(true);
      }
    }
  }

}

