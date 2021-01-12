package generate;

import com.zb.VboxData.TVboxGatewayConn;

public interface TVboxGatewayConnDao {
    int deleteByPrimaryKey(Long id);

    int insert(TVboxGatewayConn record);

    int insertSelective(TVboxGatewayConn record);

    TVboxGatewayConn selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVboxGatewayConn record);

    int updateByPrimaryKey(TVboxGatewayConn record);
}