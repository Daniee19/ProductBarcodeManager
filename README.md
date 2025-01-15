```sql
Create database tiendita;
use tiendita;

create table producto (
id_producto integer primary key not null auto_increment,
codigo_barra varchar(20) not null unique,
nombre varchar(60)  null,
precio decimal(8,2)  null default 0,
cantidad integer null default 0,
compania varchar(50) null,
contenido varchar(20) null,
imagenURL varchar(200) null
);

create table usuario (
id_usuario integer primary key not null auto_increment,
nombre varchar(40) not null,
apellido varchar(40)  not null,
nombreUsuario varchar(20) not null,
contrasenia blob,
rol varchar(20) not null
);

create table pedido(
id_pedido integer primary key not null auto_increment,
id_usuario integer not null, foreign key(id_usuario)
REFERENCES usuario(id_usuario) ON DELETE CASCADE ON UPDATE CASCADE,
descuento decimal(8,2) null default 0,
subtotal decimal(8,2) not null default 0,
total decimal(8,2) not null default 0
);

create table detalle_pedido(
id_detalle_pedidos integer primary key not null auto_increment,
id_pedido integer not null, foreign key(id_pedido) REFERENCES
pedido(id_pedido) ON DELETE CASCADE ON UPDATE CASCADE,
id_producto integer not null, foreign key(id_producto) REFERENCES
producto(id_producto) ON DELETE CASCADE ON UPDATE CASCADE, 
cantidad decimal(6,2) not null default 0,
importe decimal(8,2) not null default 0
);
```
### Refeencias
<a target="_blank" href="https://icons8.com/icon/32244/barcode-reader">Escáner de código de barras 2 Filled</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
<a target="_blank" href="https://icons8.com/icon/6483/multiply">X</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
<a target="_blank" href="https://icons8.com/icon/85458/minus">Menos</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
<a target="_blank" href="https://icons8.com/icon/38033/full-screen">Full Screen</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
