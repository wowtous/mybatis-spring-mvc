package org.darebeat.dao;

import org.darebeat.model.TableIp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by darebeat on 10/24/16.
 */
@Repository
public interface ITableIpDao {

    int getRowCount();

    List<TableIp> selectByParams(Map<String, Object> params);

    List<TableIp> fetchByParams(Map<String, Object> params);
}
