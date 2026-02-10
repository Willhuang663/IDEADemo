package com.hhy.demo;

public class Device  implements Switch{
    private String name;
    //状态:开或关
    private boolean status;//默认关闭
    public Device() {
    }

    public Device(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void press() {
        status=!status;

    }
}
