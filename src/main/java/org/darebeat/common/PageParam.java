package org.darebeat.common;

import org.darebeat.model.TableIp;

import java.util.List;

/**
 * Created by darebeat on 10/24/16.
 */
public class PageParam {
    private int currPage ; // 当前页
    private int totalPage ; // 总页
    private int rowCount ; // 总记录数
    public static int pageSize = 10; // 页大小
    private List<TableIp> data ; // 数据

    public List<TableIp> getData() {
        return data;
    }

    public void setData(List<TableIp> data) {
        this.data = data;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        int totalPage = rowCount / pageSize;
        if (rowCount % pageSize > 0) {
            totalPage += 1;
        }
        setTotalPage(totalPage);
        this.rowCount = rowCount;
    }

    public static int getPageSize() {
        return pageSize;
    }

    public static void setPageSize(int pageSize) {
        PageParam.pageSize = pageSize;
    }
}
