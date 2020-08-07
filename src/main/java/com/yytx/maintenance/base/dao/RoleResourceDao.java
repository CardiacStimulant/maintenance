package com.yytx.maintenance.base.dao;

import com.yytx.maintenance.base.entity.RoleResource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleResourceDao {
    /**
     * 添加角色-资源关系
     * @param roleResource
     * @return
     */
    int addRoleResource(RoleResource roleResource);

    /**
     * 校验角色-资源关系是否存在
     * @param roleResource
     * @return
     */
    int checkRoleResourceExists(RoleResource roleResource);

    /**
     * 移除角色-资源关系
     * @param roleResource
     * @return
     */
    int removeRoleResource(RoleResource roleResource);
}