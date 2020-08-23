-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2020 a las 20:20:36
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bebe`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `clave_det` int(11) NOT NULL,
  `clave_ven` int(11) NOT NULL,
  `id_producto` char(12) NOT NULL,
  `cant_det` int(11) NOT NULL,
  `subtotal` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`clave_det`, `clave_ven`, `id_producto`, `cant_det`, `subtotal`) VALUES
(17, 10, '2220009', 1, 130),
(18, 10, '7770025', 1, 90),
(20, 12, '5550020', 1, 80),
(21, 13, '7770025', 1, 90),
(22, 14, '6660022', 1, 530),
(23, 15, '6660022', 1, 530),
(24, 16, '6660022', 2, 1060),
(25, 17, '6660022', 2, 1060),
(28, 19, '1110005', 1, 60),
(29, 19, '4440018', 2, 120),
(30, 20, '8880033', 3, 270),
(31, 21, '1234567', 2, 460),
(32, 21, '1010137', 2, 200),
(33, 22, '1234567', 2, 460),
(34, 22, '1010141', 1, 300),
(35, 22, '7770025', 2, 180),
(36, 23, '1010141', 2, 600),
(37, 23, '7770025', 1, 90),
(38, 23, '1234567', 1, 230);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `existencias`
--

CREATE TABLE `existencias` (
  `id_producto` char(12) NOT NULL,
  `exis_prod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `existencias`
--

INSERT INTO `existencias` (`id_producto`, `exis_prod`) VALUES
('1110001', 4),
('1110002', 4),
('1110003', 4),
('1110004', 4),
('1110005', 5),
('1110006', 3),
('1110007', 4),
('2220008', 3),
('2220009', 2),
('2220010', 3),
('2220011', 3),
('2220012', 2),
('3330013', 2),
('3330014', 2),
('3330015', 3),
('5550020', 4),
('5550021', 4),
('6660022', 4),
('6660023', 2),
('6660024', 3),
('9990034', 2),
('9990035', 2),
('9990036', 2),
('9990044', 3),
('2220045', 2),
('1010143', 3),
('1010142', 3),
('1010141', 0),
('1010140', 2),
('1010139', 2),
('1010138', 3),
('1010137', 2),
('7770025', 1),
('7770026', 3),
('7770027', 2),
('7770028', 3),
('7770029', 5),
('8880032', 2),
('8880031', 2),
('8880030', 2),
('4440019', 3),
('4440018', 2),
('4440017', 2),
('4440016', 2),
('1234567', -1),
('8880033', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` char(12) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `piezas` int(11) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre`, `piezas`, `marca`, `precio`, `descripcion`) VALUES
('1010137', 'Pañalero_niña', 4, 'Mon Caramel', 100, 'Pañalero liso unisex hipoalergenico'),
('1010138', 'Mameluco_uni', 3, 'Mon Caramel', 280, 'Mameluco con gorro y pies'),
('1010139', 'Conjunto_uni', 2, 'Mon Caramel', 530, 'Conjunto unisex que incluye dos mamelucos un pañalero un gorro un babero y calcetitas'),
('1010140', 'Overol_uni', 2, 'Mon Caramel', 350, 'Overol unisex que incluye un pañalero'),
('1010141', 'Mameluco _niña', 3, 'Mon Caramel', 300, 'Mameluco jaspeado para niña color rosa morado y amarillo'),
('1010142', 'Mameluco _uni', 3, 'Mon Caramel', 350, 'Mameluco jaspeado para niña color amarillo azul y gris'),
('1010143', 'Manta', 3, 'Mon Caramel', 375, 'Manta de Felpa de Velboa'),
('1110001', 'Conjunto_niño', 4, 'Gerber', 345, 'Incluye un overol de pijama orgánico, un pantalón orgánico, una gorra orgánica'),
('1110002', 'Mameluco_uni', 4, 'Gerber', 190, 'Mangas ajustadas para mantenerse en los brazos del bebé y detalles bordados'),
('1110003', 'Mameluco_niña', 4, 'Gerber', 150, 'Mangas ajustables para mantener los brazos del bebé y cierre en la pierna para facilitar el cambio'),
('1110004', 'Pañalero_niña', 5, 'Gerber', 80, 'Pañalero de manga corta y falda de hombros'),
('1110005', 'Gorro_uni', 6, 'Gerber', 60, 'Gorros de varios diseños y colores para niño y niña'),
('1110006', 'Babero_uni', 5, 'Gerber', 70, 'Cierre de cuello suave para un gran ajuste y Respaldo impermeable para mantener al bebé seco'),
('1110007', 'Manta', 4, 'Gerber', 120, 'Manta de franela unisex '),
('1234567', 'Manta', 4, 'DC Comics', 230, 'Manta de felpa estampada con tus superheroes favoritos'),
('2220008', 'Pañalero_niño', 5, 'Carters', 110, 'Cuello con interior sin etiquetas y fácil cambio de broches en la parte inferior para niño'),
('2220009', 'Pañalero_niña', 5, 'Carters', 130, 'Cuello con interior sin etiquetas y fácil cambio de broches en la parte inferior para niña'),
('2220010', 'Mameluco_niño', 3, 'Carters', 230, 'Los cierres de cierre completa prometen un cambio más fácil en estos trajes de dormir y jugar sin pie, con diseños suaves'),
('2220011', 'Mameluco_niña', 4, 'Carters', 230, ' Mamelucos de manga larga para dormir y jugar con forro polar suave para bebé'),
('2220012', 'Conjunto_niña', 2, 'Carters', 700, 'Conjunto de 7 piezas incluye gorro mameluco pañalero manga corta y manga larga pantalón y babero'),
('2220045', 'Conjunto_uni', 2, 'Carters', 950, 'Conjunto unisex que incluye un pantalón un pañalero de manga larga y un chaleco '),
('3330013', 'Overol_niña', 2, 'OshKosh', 490, 'Overol de niña sin manga corte medio de mezclilla'),
('3330014', 'Sudadera_niña', 2, 'OshKosh', 220, 'Sudadera Con Gorra Niña'),
('3330015', 'Camisa', 3, 'OshKosh', 120, 'Camisa de niño tipo polo'),
('4440016', 'Mameluco_niña', 2, 'Baby Creysi', 130, 'Mameluco de niña incluye calcetitas'),
('4440017', 'Conjunto_niño', 2, 'Baby Creysi', 130, 'Conjunto para niño invluye playera pantalón y babero'),
('4440018', 'Babero_uni', 4, 'Baby Creysi', 60, 'Babero unisex hipoalergenico'),
('4440019', 'Pañalero_uni', 3, 'Baby Creysi', 90, 'Pañalero unisex hipoalergenico'),
('5550020', 'Pañalero_niño', 5, 'DC Comics', 80, 'Pañalero para recién nacidos y bebés con los superhéroes de la Liga de la Justicia'),
('5550021', 'Pañalero_niño', 4, 'DC Comics', 80, 'Pañalero para recién nacidos y bebés con estampado de superchica'),
('6660022', 'Conjunto_niña', 10, 'Levis', 530, 'Conjunto de niña que incluye sudadera y pantalon'),
('6660023', 'Conjunto_niño', 2, 'Levis', 530, 'Conjunto de niña que incluye sudadera y pantalón de mezclilla'),
('6660024', 'Playera_niño', 3, 'Levis', 180, 'Playera estampada de niño'),
('7770025', 'Pañalero_niño', 6, 'Calvin Klein', 90, ' Pañalero de manga corta'),
('7770026', 'Mameluco_uni', 3, 'Calvin Klein', 430, 'Mameluco calientito para niño y niña'),
('7770027', 'Conjunto_uni', 2, 'Calvin Klein', 700, 'Conjunto de niño y niña que incluye un sudadera playera y pantalon'),
('7770028', 'Gorro_uni', 3, 'Calvin Klein', 100, 'Gorro unisex para bebe'),
('7770029', 'Babero_uni', 5, 'Calvin Klein', 85, 'Baberos unisex'),
('8880030', 'Pañalero_uni', 2, 'Fisher Price', 120, 'Pañalero manga corta o larga unisex'),
('8880031', 'Mameluco_uni', 2, 'Fisher Price', 240, 'Mameluco de rayas y estampado unisex'),
('8880032', 'Conjunto_uni', 2, 'Fisher Price', 280, 'Conjunto que incluye un pañalero de manga larga un pantalón y un babero'),
('8880033', 'Babero_uni', 8, 'Fisher Price', 90, 'Babero para niño y niña varios colores y diseños'),
('9990034', 'Conjunto_niño', 2, 'Disney', 560, 'Conjunto para niño que incluye short y playera'),
('9990035', 'Mameluco_uni', 2, 'Disney', 450, 'Mameluco unisex calientito de Mickey Mouse o Sulley'),
('9990036', 'Pañalero_niño', 2, 'Disney', 280, 'Pañalero con estampado de Woody que incluye gorro'),
('9990044', 'Manta', 4, 'Truper', 420, 'Manta de Felpa de forro polar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `clave_ven` int(11) NOT NULL,
  `fecha` varchar(12) NOT NULL,
  `hora` varchar(12) NOT NULL,
  `total` float NOT NULL,
  `piezas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`clave_ven`, `fecha`, `hora`, `total`, `piezas`) VALUES
(10, '13-6-2020', '22:52:2', 220, 2),
(11, '13-6-2020', '23:0:29', 225, 5),
(12, '13-6-2020', '23:43:57', 80, 1),
(13, '13-6-2020', '23:45:39', 90, 1),
(14, '13-6-2020', '23:50:59', 530, 1),
(15, '13-6-2020', '23:58:14', 530, 1),
(16, '14-6-2020', '0:2:48', 1060, 2),
(17, '14-6-2020', '0:13:50', 1060, 2),
(18, '14-6-2020', '7:17:45', 630, 4),
(19, '14-6-2020', '8:26:54', 180, 3),
(20, '14-6-2020', '8:41:32', 270, 3),
(21, '14-6-2020', '11:40:3', 660, 4),
(22, '14-6-2020', '12:11:12', 940, 5),
(23, '14-6-2020', '12:19:42', 920, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`clave_det`),
  ADD KEY `clave_ven` (`clave_ven`),
  ADD KEY `detalle_venta_ibfk_2` (`id_producto`);

--
-- Indices de la tabla `existencias`
--
ALTER TABLE `existencias`
  ADD KEY `existencias_ibfk_1` (`id_producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`clave_ven`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `clave_det` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `clave_ven` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`clave_ven`) REFERENCES `venta` (`clave_ven`),
  ADD CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE;

--
-- Filtros para la tabla `existencias`
--
ALTER TABLE `existencias`
  ADD CONSTRAINT `existencias_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
