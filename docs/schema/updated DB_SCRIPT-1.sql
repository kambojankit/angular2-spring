SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sakila
-- -----------------------------------------------------

DROP SCHEMA manin;
-- -----------------------------------------------------
-- Schema manin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `manin` DEFAULT CHARACTER SET utf8 ;
USE `manin` ;

-- -----------------------------------------------------
-- Table `manin`.`department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`department` ;

CREATE TABLE IF NOT EXISTS `manin`.`department` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `code` VARCHAR(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `manin`.`category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`category` ;

CREATE TABLE IF NOT EXISTS `manin`.`category` (
  `id` INT(11) NOT NULL,
  `dept_id` INT(11) NULL DEFAULT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `code` VARCHAR(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `category_dept_key`
  FOREIGN KEY (`dept_id`)
  REFERENCES `manin`.`department` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE INDEX `department_idx` ON `manin`.`category` (`dept_id` ASC);


-- -----------------------------------------------------
-- Table `manin`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`user` ;

CREATE TABLE IF NOT EXISTS `manin`.`user` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `home` VARCHAR(45) NULL DEFAULT NULL,
  `street` VARCHAR(45) NULL DEFAULT NULL,
  `city` VARCHAR(45) NULL DEFAULT NULL,
  `state` VARCHAR(45) NULL DEFAULT NULL,
  `pincode` INT(11) NULL DEFAULT NULL,
  `date_of_birth` DATETIME NULL DEFAULT NULL,
  `gender` VARCHAR(1) NULL DEFAULT NULL,
  `landmark` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `manin`.`pricing`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`pricing` ;

CREATE TABLE IF NOT EXISTS `manin`.`pricing` (
  `id` INT(11) NOT NULL,
  `currency` VARCHAR(45) NULL DEFAULT NULL,
  `cost_price` DECIMAL(10,2) NULL DEFAULT NULL,
  `procurement_price` DECIMAL(10,2) NULL DEFAULT NULL,
  `maintainence_price` DECIMAL(10,2) NULL DEFAULT NULL,
  `selling_price` DECIMAL(10,2) NULL DEFAULT NULL,
  `discount` DECIMAL(10,2) NULL DEFAULT NULL,
  `max_discount` DECIMAL(10,2) NULL DEFAULT NULL,
  `marked_price` DECIMAL(10,2) NULL DEFAULT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `pricing_ibfk_1`
  FOREIGN KEY (`created_by`)
  REFERENCES `manin`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE INDEX `user_idx` ON `manin`.`pricing` (`created_by` ASC);


-- -----------------------------------------------------
-- Table `manin`.`product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`product` ;

CREATE TABLE IF NOT EXISTS `manin`.`product` (
  `id` INT(11) NOT NULL,
  `department` INT(11) NULL DEFAULT NULL,
  `category` INT(11) NULL DEFAULT NULL,
  `brand` VARCHAR(45) NULL DEFAULT NULL,
  `thumbnail_uri` VARCHAR(45) NULL DEFAULT NULL,
  `image_uri` VARCHAR(45) NULL DEFAULT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `title` VARCHAR(45) NULL DEFAULT NULL,
  `description` VARCHAR(45) NULL DEFAULT NULL,
  `short_desc` VARCHAR(45) NULL DEFAULT NULL,
  `style` VARCHAR(45) NULL DEFAULT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `product_user_key`
  FOREIGN KEY (`created_by`)
  REFERENCES `manin`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `product_cat_key`
  FOREIGN KEY (`category`)
  REFERENCES `manin`.`category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE INDEX `user_idx` ON `manin`.`product` (`created_by` ASC);

CREATE INDEX `category_idx` ON `manin`.`product` (`category` ASC);


-- -----------------------------------------------------
-- Table `manin`.`ratings`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`ratings` ;

CREATE TABLE IF NOT EXISTS `manin`.`ratings` (
  `id` INT(11) NOT NULL,
  `score` VARCHAR(45) NULL,
  `comment` VARCHAR(45) NULL,
  `user_name` VARCHAR(45) NULL,
  `user_email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `manin`.`variant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`variant` ;

CREATE TABLE IF NOT EXISTS `manin`.`variant` (
  `id` INT(11) NOT NULL,
  `product_id` INT(11) NOT NULL,
  `thumbnail_uri` VARCHAR(45) NULL DEFAULT NULL,
  `image_uri` VARCHAR(45) NULL DEFAULT NULL,
  `color` VARCHAR(45) NULL DEFAULT NULL,
  `created_at` VARCHAR(45) NULL DEFAULT NULL,
  `created_by` INT(11) NOT NULL,
  `sku` VARCHAR(45) NOT NULL,
  `price_id` INT(11) NOT NULL,
  `size` INT NOT NULL COMMENT 'in cms',
  `weight` INT NOT NULL COMMENT 'in grams',
  `capacity` INT NOT NULL COMMENT 'in litres',
  `ratings` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `variant_usr_key`
  FOREIGN KEY (`created_by`)
  REFERENCES `manin`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `variant_prc_key`
  FOREIGN KEY (`price_id`)
  REFERENCES `manin`.`pricing` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `variant_pr_key`
  FOREIGN KEY (`product_id`)
  REFERENCES `manin`.`product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `variant_rating_key`
  FOREIGN KEY (`ratings`)
  REFERENCES `manin`.`ratings` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

CREATE INDEX `user_idx` ON `manin`.`variant` (`created_by` ASC);

CREATE INDEX `price_idx` ON `manin`.`variant` (`price_id` ASC);

CREATE INDEX `variant_pr_key_idx` ON `manin`.`variant` (`product_id` ASC);

CREATE INDEX `variant_rating_key_idx` ON `manin`.`variant` (`ratings` ASC);


-- -----------------------------------------------------
-- Table `manin`.`Inventory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`Inventory` ;

CREATE TABLE IF NOT EXISTS `manin`.`Inventory` (
  `id` INT NOT NULL,
  `variant_id` INT(11) NOT NULL COMMENT '	',
  `quantity` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `variant_quant_key`
  FOREIGN KEY (`variant_id`)
  REFERENCES `manin`.`variant` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;

CREATE INDEX `variant_quant_key_idx` ON `manin`.`Inventory` (`variant_id` ASC);


-- -----------------------------------------------------
-- Table `manin`.`shipments`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`shipments` ;

CREATE TABLE IF NOT EXISTS `manin`.`shipments` (
  `id` INT(11) NOT NULL,
  `tracking_number` VARCHAR(45) NULL,
  `shipment_vendor` VARCHAR(45) NULL,
  `shipment_date` VARCHAR(45) NULL,
  `delivery_date` VARCHAR(45) NULL,
  `shipment_type` VARCHAR(45) NULL,
  `ship_to_user_id` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `manin`.`order_process`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`order_process` ;

CREATE TABLE IF NOT EXISTS `manin`.`order_process` (
  `id` INT(11) NOT NULL,
  `receive_date` VARCHAR(45) NULL,
  `pack_date` VARCHAR(45) NULL,
  `dispatch_date` VARCHAR(45) NULL,
  `delivery_date` VARCHAR(45) NULL,
  `packaging_material` VARCHAR(45) NULL,
  `manifest_date` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `manin`.`Orders`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`Orders` ;

CREATE TABLE IF NOT EXISTS `manin`.`Orders` (
  `id` INT(11) NOT NULL,
  `marketplace` VARCHAR(45) NULL,
  `marketplace_order_id` VARCHAR(45) NULL,
  `invoice_number` VARCHAR(45) NULL,
  `variant_id` INT(11) NOT NULL,
  `shipment_id` INT(11) NOT NULL,
  `order_date` VARCHAR(45) NULL,
  `order_process_id` INT(11) NOT NULL COMMENT 'The representation of order processing dates and time',
  PRIMARY KEY (`id`),
  CONSTRAINT `order_variant_key`
  FOREIGN KEY (`variant_id`)
  REFERENCES `manin`.`variant` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `order_shipment_key`
  FOREIGN KEY (`shipment_id`)
  REFERENCES `manin`.`shipments` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `order_process_id`
  FOREIGN KEY (`order_process_id`)
  REFERENCES `manin`.`order_process` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;

CREATE INDEX `order_variant_key_idx` ON `manin`.`Orders` (`variant_id` ASC);

CREATE INDEX `order_shipment_key_idx` ON `manin`.`Orders` (`shipment_id` ASC);

CREATE INDEX `order_process_id_idx` ON `manin`.`Orders` (`order_process_id` ASC);


-- -----------------------------------------------------
-- Table `manin`.`Procurement`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `manin`.`Procurement` ;

CREATE TABLE IF NOT EXISTS `manin`.`Procurement` (
  `id` INT NOT NULL,
  `bill_number` VARCHAR(45) NULL,
  `bill_date` VARCHAR(45) NULL,
  `bill_image_album_uri` VARCHAR(45) NULL,
  `bill_amount` VARCHAR(45) NULL,
  `ship_charges` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
