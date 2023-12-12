package com.yehan.web.common;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("commonDao")
public class CommonDao {//implements CommonDao {

  @Resource(name = "sqlSessionTemplate")
  private SqlSession sqlSession;
  public void setSqlSession(SqlSession sqlSession) {
      this.sqlSession = sqlSession;
  }

  public <T> T selectOne(String queryId) {
      return this.sqlSession.selectOne(queryId);
  }

  public <T> T selectOne(String queryId, Object parameter) {
      System.out.println(sqlSession.toString());
      return this.sqlSession.selectOne(queryId, parameter);
  }

  public <K, V> Map<K, V> selectMap(String queryId, String mapKey) {
      return this.sqlSession.selectMap(queryId, mapKey);
  }

  public <K, V> Map<K, V> selectMap(String queryId, Object parameter, String mapKey) {
      return this.sqlSession.selectMap(queryId, parameter, mapKey);
  }

  public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
      return this.sqlSession.selectMap(statement, parameter, mapKey, rowBounds);
  }

  public <E> List<E> selectList(String queryId) {
      return this.sqlSession.selectList(queryId);
  }

  public <E> List<E> selectList(String queryId, Object parameter) {
      return this.sqlSession.selectList(queryId, parameter);
  }

  public <E> List<E> selectList(String queryId, Object parameter, RowBounds rowBounds) {
      return this.sqlSession.selectList(queryId, parameter, rowBounds);
  }

  public void select(String queryId, ResultHandler handler) {
      this.sqlSession.select(queryId, handler);
  }

  public void select(String queryId, Object parameter, ResultHandler handler) {
      this.sqlSession.select(queryId, parameter, handler);
  }

  public void select(String queryId, Object parameter, RowBounds rowBounds, ResultHandler handler) {
      this.sqlSession.select(queryId, parameter, rowBounds, handler);
  }

  public int insert(String queryId) {
      return this.sqlSession.insert(queryId);
  }

  public int insert(String queryId, Object parameter) {
      return this.sqlSession.insert(queryId, parameter);
  }

  public int update(String queryId) {
      return this.sqlSession.update(queryId);
  }

  public int update(String queryId, Object parameter) {
      return this.sqlSession.update(queryId, parameter);
  }

  public int delete(String queryId) {
      return this.sqlSession.delete(queryId);
  }

  public int delete(String queryId, Object parameter) {
      return this.sqlSession.delete(queryId, parameter);
  }
}