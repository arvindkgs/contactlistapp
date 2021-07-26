INSERT INTO `Organisation`(`id`,`name`, `abn`) values (1, 'Australian Agent for International Students', '99 999 999 991');
INSERT INTO `Organisation`(`id`,`name`, `abn`) values (2, 'CRP AUSTRALIA PTY LTD', '99 999 999 992');
INSERT INTO `Organisation`(`id`,`name`, `abn`) values (3, 'THE AUSTRALIAN', '99 999 999 993');

INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (1, 'Sophie', 'Klein', 1, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (2, 'Perry', 'Kennedy', 1, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (3, 'Alma', 'Armstrong', 1, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (4, 'Alexander', 'Morris', 2, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (5, 'Wm', 'Brady', 2, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (6, 'Rudy', 'Bush', 2, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (7, 'Andres', 'Mcguire', 2, CURRENT_TIMESTAMP());
INSERT INTO `Contact`(`id`,`first_name`, `last_name`, `organisation_id`, `created_date`) values (8, 'Nick', 'Lane', 3, CURRENT_TIMESTAMP());