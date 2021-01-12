package generate;

import com.zb.VboxData.TVboxMonitorGroup;

public interface TVboxMonitorGroupDao {
    int deleteByPrimaryKey(Long id);

    int insert(TVboxMonitorGroup record);

    int insertSelective(TVboxMonitorGroup record);

    TVboxMonitorGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVboxMonitorGroup record);

    int updateByPrimaryKey(TVboxMonitorGroup record);
}