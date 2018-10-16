package com.wuhao.model;

public class usr {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
    	System.out.println(name);
        return "usr{" +
                "id=" + id +
                ", name=" + name +
                "}";
    }
}