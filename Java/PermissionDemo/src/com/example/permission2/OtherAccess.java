package com.example.permission2;


import com.example.permission1.PermissionType;

public class OtherAccess {
    public void access() {
        PermissionType permissionType = new PermissionType();
        System.out.println("不同包非继承类访问结果: ");
        System.out.println("\t访问 Public 权限:" + permissionType.publicName);
        System.out.println("\t访问 Defualt 权限失败，不可以直接访问 Defualt 权限");
        System.out.println("\t访问 Protected 权限失败，不可以直接访问 Protected 权限");
        System.out.println("\t访问 Private 权限失败，不可以直接访问 Private 权限");
    }


}
