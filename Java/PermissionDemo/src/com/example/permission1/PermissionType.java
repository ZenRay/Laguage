package com.example.permission1;

public class PermissionType {
    public String publicName="Public 权限";
    String defualtName = "Defualt 权限";
    protected String protectedName = "Protected 权限";
    private String privateName = "Private 权限";

    public void accessPublic(){
        System.out.println("\t相同类文件中访问 public:" + publicName);
    }

    public void accessDefault(){
        System.out.println("\t相同类文件中访问 default:" + defualtName);
    }

    public void accessProtected(){
        System.out.println("\t相同类文件中访问 protected:" + protectedName);
    }

    public void accessPrivate(){
        System.out.println("\t相同类文件中访问 private:" + privateName);
    }

}
