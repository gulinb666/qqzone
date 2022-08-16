# QQZone项目(JavaWeb)
该项目类似于qq空间，功能(**发表日志，回复日志，楼主回复，好友列表，删除日志，删除回复**)，原项目教程在b站上的尚硅谷的JavaWeb视频，我把剩下的控制主人回复和添加回复做完了，虽然也遇到了很多坑。本项目采用(**maven,tomcat(8.5.81)**)构建，前端采用了bootstrap样式库优化页面。

lib文件夹里放的都是jar包，无需自己再去找jar包下载，resources放的是xml配置文件，不要删除。

java文件夹里面的myssm里都是配置文件，主要功能实现在qqzone里的controller里

> 启动tomcat的url
```
http://localhost:8080/pro12/page.do?operate=page&page=login
```
> 数据库结构
```
-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- 主机： localhost
-- 生成日期： 2022-08-16 11:09:50
-- 服务器版本： 5.7.36
-- PHP 版本： 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `qqzonedb`
--

-- --------------------------------------------------------

--
-- 表的结构 `t_friend`
--

CREATE TABLE `t_friend` (
  `id` int(10) UNSIGNED NOT NULL,
  `uid` int(11) NOT NULL,
  `fid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `t_host_reply`
--

CREATE TABLE `t_host_reply` (
  `id` int(10) UNSIGNED NOT NULL,
  `content` varchar(500) NOT NULL,
  `hostReplyDate` datetime DEFAULT NULL,
  `author` bigint(11) NOT NULL,
  `reply` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `t_reply`
--

CREATE TABLE `t_reply` (
  `id` int(10) UNSIGNED NOT NULL,
  `content` varchar(255) NOT NULL,
  `replyDate` datetime DEFAULT NULL,
  `author` bigint(11) NOT NULL,
  `topic` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `t_topic`
--

CREATE TABLE `t_topic` (
  `id` int(10) UNSIGNED NOT NULL,
  `title` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `topicDate` datetime DEFAULT NULL,
  `author` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `t_user_basic`
--

CREATE TABLE `t_user_basic` (
  `id` int(11) UNSIGNED NOT NULL,
  `loginId` varchar(255) NOT NULL,
  `nickName` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `headImg` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- 转储表的索引
--

--
-- 表的索引 `t_friend`
--
ALTER TABLE `t_friend`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `t_host_reply`
--
ALTER TABLE `t_host_reply`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `t_reply`
--
ALTER TABLE `t_reply`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `t_topic`
--
ALTER TABLE `t_topic`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `t_user_basic`
--
ALTER TABLE `t_user_basic`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `t_friend`
--
ALTER TABLE `t_friend`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- 使用表AUTO_INCREMENT `t_host_reply`
--
ALTER TABLE `t_host_reply`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- 使用表AUTO_INCREMENT `t_reply`
--
ALTER TABLE `t_reply`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- 使用表AUTO_INCREMENT `t_topic`
--
ALTER TABLE `t_topic`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- 使用表AUTO_INCREMENT `t_user_basic`
--
ALTER TABLE `t_user_basic`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

```