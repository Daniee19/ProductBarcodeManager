```sql
Create database tiendita;
use tiendita;

create table producto (
id_producto integer primary key not null auto_increment,
codigo_barra varchar(20) not null,
nombre varchar(60) not null,
precio decimal(8,2) not null default 0,
cantidad integer not null default 0,
compania varchar(50) null,
cantidad_contenida varchar(20) null,
imagenURL varchar(200) null
);
```
