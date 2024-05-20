package com.example.permission1;

public class AccessPermission {
    public void access() {
        PermissionType permissionType = new PermissionType();

        System.out.println("相同类测试相关结果:");
        permissionType.accessPublic();
        permissionType.accessProtected();
        permissionType.accessPrivate();
        permissionType.accessDefault();

        System.out.println("相同包不同类中测试访问结果:");
        System.out.println("\t访问 Public 权限:" + permissionType.publicName);
        System.out.println("\t访问 Protected 权限:" + permissionType.protectedName);
        System.out.println("\t访问 Default 权限:" + permissionType.defualtName);
        System.out.println("\t访问 Private 权限失败，不可以直接访问 Private 权限");


    }
}
