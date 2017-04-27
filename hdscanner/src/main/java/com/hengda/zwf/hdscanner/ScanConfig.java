package com.hengda.zwf.hdscanner;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 扫描参数配置类
 *
 * @author 祝文飞（Tailyou）
 * @time 2017/4/27 17:22
 */
public class ScanConfig implements Parcelable {

    private int title;
    private int scanTip;
    private int toolbarColor;
    private int laserColor;
    private int mediaResId;
    private int frameMarginTop;
    private int frameSizeWidth;
    private int frameSizeHeight;
    private int frameCornerLength;
    private int laserLineHeight;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getScanTip() {
        return scanTip;
    }

    public void setScanTip(int scanTip) {
        this.scanTip = scanTip;
    }

    public int getToolbarColor() {
        return toolbarColor;
    }

    public void setToolbarColor(int toolbarColor) {
        this.toolbarColor = toolbarColor;
    }

    public int getLaserColor() {
        return laserColor;
    }

    public void setLaserColor(int laserColor) {
        this.laserColor = laserColor;
    }

    public int getMediaResId() {
        return mediaResId;
    }

    public void setMediaResId(int mediaResId) {
        this.mediaResId = mediaResId;
    }

    public int getFrameMarginTop() {
        return frameMarginTop;
    }

    public void setFrameMarginTop(int frameMarginTop) {
        this.frameMarginTop = frameMarginTop;
    }

    public int getFrameSizeWidth() {
        return frameSizeWidth;
    }

    public void setFrameSizeWidth(int frameSizeWidth) {
        this.frameSizeWidth = frameSizeWidth;
    }

    public int getFrameSizeHeight() {
        return frameSizeHeight;
    }

    public void setFrameSizeHeight(int frameSizeHeight) {
        this.frameSizeHeight = frameSizeHeight;
    }

    public int getFrameCornerLength() {
        return frameCornerLength;
    }

    public void setFrameCornerLength(int frameCornerLength) {
        this.frameCornerLength = frameCornerLength;
    }

    public int getLaserLineHeight() {
        return laserLineHeight;
    }

    public void setLaserLineHeight(int laserLineHeight) {
        this.laserLineHeight = laserLineHeight;
    }

    public ScanConfig(int title, int scanTip, int toolbarColor,
                      int laserColor, int mediaResId, int frameMarginTop,
                      int frameSizeWidth, int frameSizeHeight,
                      int frameCornerLength, int laserLineHeight) {
        this.title = title;
        this.scanTip = scanTip;
        this.toolbarColor = toolbarColor;
        this.laserColor = laserColor;
        this.mediaResId = mediaResId;
        this.frameMarginTop = frameMarginTop;
        this.frameSizeWidth = frameSizeWidth;
        this.frameSizeHeight = frameSizeHeight;
        this.frameCornerLength = frameCornerLength;
        this.laserLineHeight = laserLineHeight;
    }

    public ScanConfig() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.title);
        dest.writeInt(this.scanTip);
        dest.writeInt(this.toolbarColor);
        dest.writeInt(this.laserColor);
        dest.writeInt(this.mediaResId);
        dest.writeInt(this.frameMarginTop);
        dest.writeInt(this.frameSizeWidth);
        dest.writeInt(this.frameSizeHeight);
        dest.writeInt(this.frameCornerLength);
        dest.writeInt(this.laserLineHeight);
    }

    protected ScanConfig(Parcel in) {
        this.title = in.readInt();
        this.scanTip = in.readInt();
        this.toolbarColor = in.readInt();
        this.laserColor = in.readInt();
        this.mediaResId = in.readInt();
        this.frameMarginTop = in.readInt();
        this.frameSizeWidth = in.readInt();
        this.frameSizeHeight = in.readInt();
        this.frameCornerLength = in.readInt();
        this.laserLineHeight = in.readInt();
    }

    public static final Creator<ScanConfig> CREATOR = new Creator<ScanConfig>() {
        @Override
        public ScanConfig createFromParcel(Parcel source) {
            return new ScanConfig(source);
        }

        @Override
        public ScanConfig[] newArray(int size) {
            return new ScanConfig[size];
        }
    };
}