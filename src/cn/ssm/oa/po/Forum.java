package cn.ssm.oa.po;

public class Forum {
    private Long id;

    private String name;

    private String description;

    private Integer position;

    private Integer topiccount;

    private Integer articlecount;

    private Long lasttopicid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getTopiccount() {
        return topiccount;
    }

    public void setTopiccount(Integer topiccount) {
        this.topiccount = topiccount;
    }

    public Integer getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    public Long getLasttopicid() {
        return lasttopicid;
    }

    public void setLasttopicid(Long lasttopicid) {
        this.lasttopicid = lasttopicid;
    }
}