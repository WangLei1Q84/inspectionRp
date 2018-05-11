package com.wanglei.util;

import java.io.Serializable;
import java.util.List;

public class Page
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private static int DEFAULT_COUNT = 20;

  private int pageSize = DEFAULT_COUNT;
  private int pageNo = 1;
  private int totalPage = 1;
  private int totalRecord;
  private List records;

  public Page()
  {
  }

  public Page(int pageSize)
  {
    this();
    setPageSize(pageSize);
  }

  public Page(int pageSize, int recordNumber) {
    setPageNo(pageSize);
    setTotal(recordNumber);
  }

  public Page(int pageSize, int pageNo, int recordNumber) {
    setPageSize(pageSize);
    setPageNo(pageNo);
    setTotal(recordNumber);
  }

  public Page(int pageSize, int recordNumber, List records) {
    this(pageSize, recordNumber);
    this.records = records;
  }

  public void setPageSize(int pageSize)
  {
    if (pageSize > 0)
      this.pageSize = pageSize;
  }

  public void setPageNo(int pageNo)
  {
    if (pageNo < 1) {
      this.pageNo = 1;
    }
    this.pageNo = pageNo;
  }

  public void setTotal(int totalRecord) {
    if (totalRecord > 0)
    {
      int t = totalRecord / this.pageSize;
      t++; this.totalPage = (totalRecord % this.pageSize != 0 ? t : t);
      this.totalRecord = totalRecord;
    }
  }

  public int getCurrent() {
    return this.pageNo > this.totalPage ? this.totalPage : this.pageNo;
  }

  public int getTotalPage() {
    return this.totalPage;
  }

  public int getTotalRecord() {
    return this.totalRecord;
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public int getPrePage() {
    return this.pageNo > 2 ? this.pageNo - 1 : 1;
  }

  public int getNextPage() {
    return this.pageNo < this.totalPage ? this.pageNo + 1 : this.totalPage;
  }

  public int getStartIndex() {
    return (this.pageNo - 1) * this.pageSize + 1;
  }

  public void setRecords(List obj) {
    this.records = obj;
  }
  public List getRecords() {
    return this.records;
  }
  public int getPageNo() {
    return this.pageNo;
  }
  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }
  public void setTotalRecord(int totalRecord) {
    if (totalRecord > 0)
    {
      int t = totalRecord / this.pageSize;
      t++; this.totalPage = (totalRecord % this.pageSize != 0 ? t : t);
      this.totalRecord = totalRecord;
    }
  }
}

/* Location:           C:\Users\hao\AppData\Local\Temp\Rar$DIa0.390\
 * Qualified Name:     com.huateng.base.common.beans.Page
 * JD-Core Version:    0.6.0
 */