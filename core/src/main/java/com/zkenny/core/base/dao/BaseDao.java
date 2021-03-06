package com.zkenny.core.base.dao;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 所有的Dao须继承BaseDao
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 11:55
 */
public abstract class BaseDao {
    private SqlSessionWrapper sqlSessionWrapper;
    //TODO 暂时写死 从公共配置文件中读取
    private static final String ENV = "sme";

    protected String nameSpace = this.getClass().getName() + ".";

    public BaseDao() {
        sqlSessionWrapper = SqlSessionWrapper.getInstance(ENV);
    }

    public SqlSessionWrapper getSessionWrapper() {
        return sqlSessionWrapper;
    }

    protected Object selectOne(String statement) {
        return selectOne(statement, null);
    }

    protected Object selectOne(String statement, Object parameter) {
        String operationId = statement.substring(statement.lastIndexOf(".") + 1);
        if (!operationId.equals("get")) {
            List list = selectList(statement, parameter, RowBounds.DEFAULT);
            if (list.size() == 0) {
                return null;
            } else {
                return list.get(0);
            }
        } else {
            return sqlSessionWrapper.selectOne(nameSpace + statement, parameter);
        }
    }

    protected List selectList(String statement) {
        return selectList(statement, null);
    }

    protected List selectList(String statement, Object parameter) {
        return selectList(statement, parameter, RowBounds.DEFAULT);
    }

    protected List selectList(String statement, Object parameter, RowBounds rowBounds) {
        return sqlSessionWrapper.selectList(nameSpace + statement, parameter, rowBounds);
    }

    protected int insert(String statement) {
        return insert(statement, null);
    }

    protected int insert(String statement, Object parameter) {
        return sqlSessionWrapper.insert(nameSpace + statement, parameter);
    }

    protected int update(String statement) {
        return update(statement, null);
    }

    protected int update(String statement, Object parameter) {
        return sqlSessionWrapper.update(nameSpace + statement, parameter);
    }

    protected int delete(String statement) {
        return delete(statement, null);
    }

    protected int delete(String statement, Object parameter) {
        return sqlSessionWrapper.delete(nameSpace + statement, parameter);
    }

}
