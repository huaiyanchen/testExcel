package generate;

import com.zb.VboxData.TVboxMonitor;

public interface TVboxMonitorDao {
    int deleteByPrimaryKey(Long id);

    int insert(TVboxMonitor record);

    int insertSelective(TVboxMonitor record);

    TVboxMonitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVboxMonitor record);

    int updateByPrimaryKey(TVboxMonitor record);
}