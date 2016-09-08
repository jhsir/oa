DROP TABLE IF EXISTS `app_user`;
CREATE TABLE `app_user` (
  `userid` bigint(20) NOT NULL,
  `title` smallint(6) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `depid` bigint(20) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `jobid` int(11) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `fax` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `accessiontime` datetime DEFAULT NULL,
  `status` smallint(255) DEFAULT NULL,
  `educatton` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `delflag` smallint(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;