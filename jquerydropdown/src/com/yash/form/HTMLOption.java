package com.yash.form;

public class HTMLOption {
	 
    String id;
    String value;
 
    public HTMLOption(String id, String value) {
        this.id = id;
        this.value = value;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }
 
    @Override
    public String toString() {
        return "{id:"+id+",value:'"+value+"'}";
    }
}