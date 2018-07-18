<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/7/11
 * Time: 11:30
 */
$market=$_GET["market"];
$year=$_GET["year"];
$month=$_GET["month"];
$manage=$_GET["manage"];
$name=$_GET["name"];
$location=$_GET["location"];
$channels=$_GET["channels"];
echo $market.$year.$month.$manage.$name.$location.$channels;
?>