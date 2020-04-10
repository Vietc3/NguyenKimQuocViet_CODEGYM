-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: case_study_database
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bophan`
--

DROP TABLE IF EXISTS `bophan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bophan` (
  `IDBoPhan` int(11) NOT NULL AUTO_INCREMENT,
  `BoPhan` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bophan`
--

LOCK TABLES `bophan` WRITE;
/*!40000 ALTER TABLE `bophan` DISABLE KEYS */;
INSERT INTO `bophan` VALUES (1,'Giặc ủi'),(2,'Nấu ăn'),(3,'Quét Rác');
/*!40000 ALTER TABLE `bophan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `IDDichVu` int(11) NOT NULL AUTO_INCREMENT,
  `IDKieuThue` varchar(45) DEFAULT NULL,
  `IDLoaiDichVu` int(11) DEFAULT NULL,
  `TenDichVu` varchar(45) DEFAULT NULL,
  `DienTich` int(11) DEFAULT NULL,
  `SoTang` int(11) DEFAULT NULL,
  `SoNguoiToiDa` varchar(45) DEFAULT NULL,
  `ChiPhiThue` varchar(45) DEFAULT NULL,
  `TrangThai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDDichVu`),
  KEY `IDLoaiDichVu` (`IDLoaiDichVu`),
  KEY `IDKieuThue` (`IDKieuThue`),
  CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`IDLoaiDichVu`) REFERENCES `loaidichvu` (`IDLoaiDichVu`),
  CONSTRAINT `dichvu_ibfk_2` FOREIGN KEY (`IDKieuThue`) REFERENCES `kieuthue` (`IDKieuThue`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'1',1,'Villa',400,3,'10','10000','Còn'),(2,'2',2,'House',200,2,'9','1000','Còn'),(3,'1',3,'Room',100,1,'8','1000','Hết');
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvudikem`
--

DROP TABLE IF EXISTS `dichvudikem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvudikem` (
  `IDDichVuDiKem` int(11) NOT NULL AUTO_INCREMENT,
  `Gia` int(11) DEFAULT NULL,
  `DonVi` int(11) DEFAULT NULL,
  `TrangThaiSuDung` varchar(45) DEFAULT NULL,
  `tendichvudikem` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDDichVuDiKem`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvudikem`
--

LOCK TABLES `dichvudikem` WRITE;
/*!40000 ALTER TABLE `dichvudikem` DISABLE KEYS */;
INSERT INTO `dichvudikem` VALUES (1,100000,1,'Còn','Karaoke'),(2,80000,1,'Còn','Massage'),(3,10000,1,'Còn','Thức ăn'),(4,20000,1,'Còn','Nước uống');
/*!40000 ALTER TABLE `dichvudikem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdong`
--

DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `IDHopDong` int(11) NOT NULL AUTO_INCREMENT,
  `IDNhanVien` int(11) DEFAULT NULL,
  `IDKhachHang` int(11) DEFAULT NULL,
  `IDDichVu` int(11) DEFAULT NULL,
  `NgayLamHopDong` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `TienDatCoc` int(11) DEFAULT NULL,
  `TongTien` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDHopDong`),
  KEY `IDNhanVien` (`IDNhanVien`),
  KEY `IDKhachHang` (`IDKhachHang`),
  KEY `IDDichVu` (`IDDichVu`),
  CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`IDNhanVien`) REFERENCES `nhanvien` (`IDNhanVien`),
  CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`IDKhachHang`) REFERENCES `khachhang` (`IDKhachHang`),
  CONSTRAINT `hopdong_ibfk_3` FOREIGN KEY (`IDDichVu`) REFERENCES `dichvu` (`IDDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
INSERT INTO `hopdong` VALUES (1,1,1,1,'2015-03-15','2015-06-15',40000,50000),(2,3,2,2,'2014-03-15','2014-06-15',10000,30000),(3,4,3,3,'2017-03-15','2019-02-15',10000,80000),(4,2,4,1,'2018-07-15','2018-10-15',50000,60000);
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdongchitiet`
--

DROP TABLE IF EXISTS `hopdongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdongchitiet` (
  `IDHopDongChiTiet` int(11) NOT NULL AUTO_INCREMENT,
  `IDHopDong` int(11) DEFAULT NULL,
  `IDDichVuDiKem` int(11) DEFAULT NULL,
  `IDDichVu` int(11) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDHopDongChiTiet`),
  KEY `IDDichVuDiKem` (`IDDichVuDiKem`),
  KEY `IDHopDong` (`IDHopDong`),
  CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`IDDichVuDiKem`) REFERENCES `dichvudikem` (`IDDichVuDiKem`),
  CONSTRAINT `hopdongchitiet_ibfk_2` FOREIGN KEY (`IDHopDong`) REFERENCES `hopdong` (`IDHopDong`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdongchitiet`
--

LOCK TABLES `hopdongchitiet` WRITE;
/*!40000 ALTER TABLE `hopdongchitiet` DISABLE KEYS */;
INSERT INTO `hopdongchitiet` VALUES (1,1,1,1,2),(2,2,2,3,1),(3,3,3,2,2),(4,4,1,1,3);
/*!40000 ALTER TABLE `hopdongchitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `IDKhachHang` int(11) NOT NULL AUTO_INCREMENT,
  `IDLoaiKhach` int(11) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `SoCMTND` varchar(45) DEFAULT NULL,
  `SDT` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `HoVaTen` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDKhachHang`),
  KEY `IDLoaiKhach` (`IDLoaiKhach`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`IDLoaiKhach`) REFERENCES `loaikhach` (`IDLoaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,1,'1997-03-31','123456789','123456789','vietdat657@gmail.com','Đà Nẵng','Nguyen Kim Quoc Viet '),(2,2,'1995-05-31','312456789','123456789','vietdat6573@gmail.com','Quảng Trị','Nguyen Kim Quoc Viet 1'),(3,4,'1967-03-31','124578781','123456789','vietdat6572@gmail.com','Sài Gòn','Nguyen Kim Quoc Viet 2'),(4,5,'1937-00-31','326598987','123456789','vietdat6571@gmail.com','Quảng Trị','Nguyen Kim Quoc Viet 3'),(5,3,'1994-03-31','123456755','123456789','vietdat65745@gmail.com','Đà Nẵng 4','Nguyen Kim Quoc Viet 4');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kieuthue`
--

DROP TABLE IF EXISTS `kieuthue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieuthue` (
  `IDKieuThue` varchar(45) NOT NULL,
  `TenKieuThue` varchar(45) DEFAULT NULL,
  `Gia` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDKieuThue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieuthue`
--

LOCK TABLES `kieuthue` WRITE;
/*!40000 ALTER TABLE `kieuthue` DISABLE KEYS */;
INSERT INTO `kieuthue` VALUES ('1','Ngày',1000),('2','Giờ',100);
/*!40000 ALTER TABLE `kieuthue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaidichvu`
--

DROP TABLE IF EXISTS `loaidichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaidichvu` (
  `IDLoaiDichVu` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoaiDichVu` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDLoaiDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaidichvu`
--

LOCK TABLES `loaidichvu` WRITE;
/*!40000 ALTER TABLE `loaidichvu` DISABLE KEYS */;
INSERT INTO `loaidichvu` VALUES (1,'Karaoke'),(2,'Beer'),(3,'Xông Hơi');
/*!40000 ALTER TABLE `loaidichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhach`
--

DROP TABLE IF EXISTS `loaikhach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhach` (
  `IDLoaiKhach` int(11) NOT NULL AUTO_INCREMENT,
  `TenLoaiKhach` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDLoaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhach`
--

LOCK TABLES `loaikhach` WRITE;
/*!40000 ALTER TABLE `loaikhach` DISABLE KEYS */;
INSERT INTO `loaikhach` VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');
/*!40000 ALTER TABLE `loaikhach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `IDNhanVien` int(11) NOT NULL AUTO_INCREMENT,
  `IDViTri` int(11) DEFAULT NULL,
  `IDTrinhDo` int(11) DEFAULT NULL,
  `IDBoPhan` int(11) DEFAULT NULL,
  `HoTen` varchar(45) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `SoCMTND` varchar(45) DEFAULT NULL,
  `Luong` varchar(45) DEFAULT NULL,
  `SDT` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDNhanVien`),
  KEY `IDViTri` (`IDViTri`),
  KEY `IDTrinhDo` (`IDTrinhDo`),
  KEY `IDBoPhan` (`IDBoPhan`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`IDViTri`) REFERENCES `vitri` (`IDViTri`),
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`IDTrinhDo`) REFERENCES `trinhdo` (`IDTrinhDo`),
  CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`IDBoPhan`) REFERENCES `bophan` (`IDBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,1,2,3,'Nhân Viên T','1997-03-01','123456789',' 10000','123456789','1@gmail.com','Quảng Trị'),(2,2,3,1,'Hhân Viên H','1997-03-01','312456789','20000','123753159','2@gmail.com','Huế '),(3,3,2,1,'Thân Viên A','1997-03-01','254123456','30000','357852159','1@g3mail.com','Sài Gòn'),(4,2,1,3,'Nhân Viên ','1997-03-01','258369741','355555','357789635','1@gmai3l.com','Đà Nẵng'),(5,3,1,2,'Nhân Viên A h','1997-03-01','357951258','20000','123789852','1@gmail4.com','Quảng Trị'),(6,1,3,2,'Nhân  Viên','1997-03-01','159357963','345000','456789357','1@gma4il.com','Đà Nẵng');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinhdo`
--

DROP TABLE IF EXISTS `trinhdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinhdo` (
  `IDTrinhDo` int(11) NOT NULL AUTO_INCREMENT,
  `TrinhDo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDTrinhDo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinhdo`
--

LOCK TABLES `trinhdo` WRITE;
/*!40000 ALTER TABLE `trinhdo` DISABLE KEYS */;
INSERT INTO `trinhdo` VALUES (1,'Đại Học'),(2,'Trung Cấp'),(3,'Thạc Sỹ');
/*!40000 ALTER TABLE `trinhdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `IDViTri` int(11) NOT NULL AUTO_INCREMENT,
  `ViTri` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDViTri`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitri`
--

LOCK TABLES `vitri` WRITE;
/*!40000 ALTER TABLE `vitri` DISABLE KEYS */;
INSERT INTO `vitri` VALUES (1,'Lao Công'),(2,'Bảo Vệ'),(3,'Giám Đốc');
/*!40000 ALTER TABLE `vitri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-05  9:18:38
