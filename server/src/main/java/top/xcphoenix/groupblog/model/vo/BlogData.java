package top.xcphoenix.groupblog.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author      xuanc
 * @date        2020/1/19 下午7:46
 * @version     1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogData {

    private long uid;
    private int categoryId;
    private long blogId;
    private String title;
    private String blogLink;
    private String originalLink;
    private boolean original;
    private String flagDesc;
    private Timestamp pubTime;
    private String username;
    private String userLink;
    private String category;
    private String categoryLink;
    private String summary;
    private String content;
    private String tags;

}

