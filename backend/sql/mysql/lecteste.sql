-- ----------------------------
-- Table structure for member
-- ----------------------------
-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member_users`;
CREATE TABLE `member_users`  (
                                 `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
                                 `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户账号',
                                 `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
                                 `nickname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户昵称',
                                 `school_id` bigint NULL DEFAULT NULL COMMENT '学校ID',
                                 `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '用户邮箱',
                                 `mobile` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '手机号码',
                                 `sex` tinyint NULL DEFAULT 0 COMMENT '用户性别',
                                 `avatar` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '头像地址',
                                 `status` tinyint NOT NULL DEFAULT 0 COMMENT '帐号状态（0正常 1停用）',
                                 `login_ip` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '最后登录IP',
                                 `login_date` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
                                 `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 140 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户信息表';