package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 聊天信息存储表
 * @TableName chat_message
 */
@TableName(value ="chat_message")
@Data
public class ChatMessage {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 发送者的用户id
     */
    @TableField(value = "sender_id")
    private String senderId;

    /**
     * 接受者的用户id
     */
    @TableField(value = "receiver_id")
    private String receiverId;

    /**
     * 消息接受者的类型，是HR还是求职者，目的为了让前端不同页面接受判断并且处理显示
     */
    @TableField(value = "receiver_type")
    private Integer receiverType;

    /**
     * 聊天内容
     */
    @TableField(value = "msg")
    private String msg;

    /**
     * 消息类型，有文字类、图片类、视频类...等，详见枚举类
     */
    @TableField(value = "msg_type")
    private Integer msgType;

    /**
     * 消息的聊天时间，既是发送者的发送时间、又是接受者的接受时间
     */
    @TableField(value = "chat_time")
    private Date chatTime;

    /**
     * 标记存储数据库，用于历史展示。每超过1分钟，则显示聊天时间，前端可以控制时间长短
     */
    @TableField(value = "show_msg_date_time_flag")
    private Integer showMsgDateTimeFlag;

    /**
     * 视频地址
     */
    @TableField(value = "video_path")
    private String videoPath;

    /**
     * 视频宽度
     */
    @TableField(value = "video_width")
    private Integer videoWidth;

    /**
     * 视频高度
     */
    @TableField(value = "video_height")
    private Integer videoHeight;

    /**
     * 视频时间
     */
    @TableField(value = "video_times")
    private Integer videoTimes;

    /**
     * 语音地址
     */
    @TableField(value = "voice_path")
    private String voicePath;

    /**
     * 语音时长
     */
    @TableField(value = "speak_voice_duration")
    private Integer speakVoiceDuration;

    /**
     * 语音消息标记是否已读未读，true: 已读，false: 未读
     */
    @TableField(value = "is_read")
    private Integer isRead;

    /**
     * 候选人用户id
     */
    @TableField(value = "resume_user_id")
    private String resumeUserId;

    /**
     * 简历名称（候选人名称）  
简历名称与职位使用字段冗余，目的相当于快照，只记录当时信息
     */
    @TableField(value = "resume_name")
    private String resumeName;

    /**
     * 候选人职位  
简历名称与职位使用字段冗余，目的相当于快照，只记录当时信息
     */
    @TableField(value = "resume_position")
    private String resumePosition;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChatMessage other = (ChatMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSenderId() == null ? other.getSenderId() == null : this.getSenderId().equals(other.getSenderId()))
            && (this.getReceiverId() == null ? other.getReceiverId() == null : this.getReceiverId().equals(other.getReceiverId()))
            && (this.getReceiverType() == null ? other.getReceiverType() == null : this.getReceiverType().equals(other.getReceiverType()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()))
            && (this.getMsgType() == null ? other.getMsgType() == null : this.getMsgType().equals(other.getMsgType()))
            && (this.getChatTime() == null ? other.getChatTime() == null : this.getChatTime().equals(other.getChatTime()))
            && (this.getShowMsgDateTimeFlag() == null ? other.getShowMsgDateTimeFlag() == null : this.getShowMsgDateTimeFlag().equals(other.getShowMsgDateTimeFlag()))
            && (this.getVideoPath() == null ? other.getVideoPath() == null : this.getVideoPath().equals(other.getVideoPath()))
            && (this.getVideoWidth() == null ? other.getVideoWidth() == null : this.getVideoWidth().equals(other.getVideoWidth()))
            && (this.getVideoHeight() == null ? other.getVideoHeight() == null : this.getVideoHeight().equals(other.getVideoHeight()))
            && (this.getVideoTimes() == null ? other.getVideoTimes() == null : this.getVideoTimes().equals(other.getVideoTimes()))
            && (this.getVoicePath() == null ? other.getVoicePath() == null : this.getVoicePath().equals(other.getVoicePath()))
            && (this.getSpeakVoiceDuration() == null ? other.getSpeakVoiceDuration() == null : this.getSpeakVoiceDuration().equals(other.getSpeakVoiceDuration()))
            && (this.getIsRead() == null ? other.getIsRead() == null : this.getIsRead().equals(other.getIsRead()))
            && (this.getResumeUserId() == null ? other.getResumeUserId() == null : this.getResumeUserId().equals(other.getResumeUserId()))
            && (this.getResumeName() == null ? other.getResumeName() == null : this.getResumeName().equals(other.getResumeName()))
            && (this.getResumePosition() == null ? other.getResumePosition() == null : this.getResumePosition().equals(other.getResumePosition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        result = prime * result + ((getReceiverId() == null) ? 0 : getReceiverId().hashCode());
        result = prime * result + ((getReceiverType() == null) ? 0 : getReceiverType().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        result = prime * result + ((getMsgType() == null) ? 0 : getMsgType().hashCode());
        result = prime * result + ((getChatTime() == null) ? 0 : getChatTime().hashCode());
        result = prime * result + ((getShowMsgDateTimeFlag() == null) ? 0 : getShowMsgDateTimeFlag().hashCode());
        result = prime * result + ((getVideoPath() == null) ? 0 : getVideoPath().hashCode());
        result = prime * result + ((getVideoWidth() == null) ? 0 : getVideoWidth().hashCode());
        result = prime * result + ((getVideoHeight() == null) ? 0 : getVideoHeight().hashCode());
        result = prime * result + ((getVideoTimes() == null) ? 0 : getVideoTimes().hashCode());
        result = prime * result + ((getVoicePath() == null) ? 0 : getVoicePath().hashCode());
        result = prime * result + ((getSpeakVoiceDuration() == null) ? 0 : getSpeakVoiceDuration().hashCode());
        result = prime * result + ((getIsRead() == null) ? 0 : getIsRead().hashCode());
        result = prime * result + ((getResumeUserId() == null) ? 0 : getResumeUserId().hashCode());
        result = prime * result + ((getResumeName() == null) ? 0 : getResumeName().hashCode());
        result = prime * result + ((getResumePosition() == null) ? 0 : getResumePosition().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", senderId=").append(senderId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", receiverType=").append(receiverType);
        sb.append(", msg=").append(msg);
        sb.append(", msgType=").append(msgType);
        sb.append(", chatTime=").append(chatTime);
        sb.append(", showMsgDateTimeFlag=").append(showMsgDateTimeFlag);
        sb.append(", videoPath=").append(videoPath);
        sb.append(", videoWidth=").append(videoWidth);
        sb.append(", videoHeight=").append(videoHeight);
        sb.append(", videoTimes=").append(videoTimes);
        sb.append(", voicePath=").append(voicePath);
        sb.append(", speakVoiceDuration=").append(speakVoiceDuration);
        sb.append(", isRead=").append(isRead);
        sb.append(", resumeUserId=").append(resumeUserId);
        sb.append(", resumeName=").append(resumeName);
        sb.append(", resumePosition=").append(resumePosition);
        sb.append("]");
        return sb.toString();
    }
}