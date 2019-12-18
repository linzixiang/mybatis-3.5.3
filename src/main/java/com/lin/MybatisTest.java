package com.lin;

import com.lin.domain.Dict;
import com.lin.mapper.DictMapper;
import com.lin.plugin.ExecutorQueryPlugin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MybatisTest {

    /**
     * 获取SqlSession
     * @return
     * @throws FileNotFoundException
     */
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream configFile = Resources.getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFile);
        Configuration configuration = sqlSessionFactory.getConfiguration();
        // 注册自定义的TypeHandler
        // configuration.getTypeHandlerRegistry().register(MyTypeHandler.class);
        // 注册Plugin
        ExecutorQueryPlugin executorQueryPlugin = new ExecutorQueryPlugin();
        Properties properties = new Properties();
        properties.put("gupao", "betterme");
        executorQueryPlugin.setProperties(properties);
        configuration.addInterceptor(executorQueryPlugin);

        return sqlSessionFactory;
    }

    @Test
    public void testQuery() throws IOException {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSessionFactory().openSession();
//            Dict param = new Dict();
//            param.setDictId(new Long(1));
            // void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler)
//            Dict dict = sqlSession.selectOne("com.gupao.mybatis.mapper.DictMapper.getById", param);
            DictMapper mapper = sqlSession.getMapper(DictMapper.class);
            Dict dict = mapper.getById(new Long(1));
            System.out.println(dict);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
