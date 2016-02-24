package cn.ssm.oa.po;

import java.util.Date;

public class Topic {
    private Long id;

    private String title;

    private String faceicon;

    private Date posttime;

    private String ipaddr;

    private Long authorid;

    private Integer type;

    private Integer replycount;

    private Date lastupdatetime;

    private Long forumid;

    private Long lastreplyid;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFaceicon() {
        return faceicon;
    }

    public void setFaceicon(String faceicon) {
        this.faceicon = faceicon == null ? null : faceicon.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    public Long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Long authorid) {
        this.authorid = authorid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Long getForumid() {
        return forumid;
    }

    public void setForumid(Long forumid) {
        this.forumid = forumid;
    }

    public Long getLastreplyid() {
        return lastreplyid;
    }

    public void setLastreplyid(Long lastreplyid) {
        this.lastreplyid = lastreplyid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}