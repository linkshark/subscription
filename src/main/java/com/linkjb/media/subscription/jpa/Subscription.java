package com.linkjb.media.subscription.jpa;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Subscription {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid")
    @GeneratedValue(generator="uuid")
    private String subscribeId;
    private String mediaId;
    private String chapterId;
    private String sendNumber;

    public String getSubscribeId() {
        return subscribeId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public String getChapterId() {
        return chapterId;
    }

    public String getSendNumber() {
        return sendNumber;
    }
}
