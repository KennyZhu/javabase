package com.yunnar.core.sns.model;

import java.util.Date;

/**
 * User: KennyZhu
 * Date: 14-7-26
 * Desc:
 */
public class SnsFollow {
    private int id;
    private long uid;
    private long followUid;
    private Date updateTime;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getFollowUid() {
        return followUid;
    }

    public void setFollowUid(long followUid) {
        this.followUid = followUid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
