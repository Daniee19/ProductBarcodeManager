## Database Diagram

![image](https://github.com/user-attachments/assets/a50bf933-d42a-4fab-97c9-ce325537d2ba)

## Database Script

```sql
Create database tiendita;
Use tiendita;

create table usuario (
idUsuario integer primary key not null auto_increment,
nombre varchar(40) not null,
apellido varchar(40)  not null,
nombreUsuario varchar(20) not null,
contrasenia blob,
rol varchar(20) not null
);

create table categoria(
idCategoria integer primary key not null auto_increment,
nombreCategoria varchar(40) not null
);

create table producto (
idProducto integer primary key not null auto_increment,
idCategoria integer not null, foreign key(idCategoria) REFERENCES categoria(idCategoria) ON DELETE CASCADE ON UPDATE CASCADE,
codigoBarra varchar(20) not null unique,
nombre varchar(60)  null,
precio decimal(8,2)  null default 0,
marca varchar(50) null,
contenido varchar(20) null,
igvAplicable tinyint(1) not null default 0,
imagenUrl varchar(200) null
);

create table venta(
idVenta integer primary key not null auto_increment,
idUsuario integer not null, foreign key(idUsuario) REFERENCES usuario(idUsuario) ON DELETE CASCADE ON UPDATE CASCADE,
fechaVenta timestamp default current_timestamp,
impTotSnIgvOExo decimal(8,2) not null default 0,
igvTotal decimal(6,2) not null default 0,
impTotMasIgv decimal(8,2) not null default 0,
descTot decimal(6,2) not null default 0,
total decimal(8,2) not null default 0,
tipoVenta enum('Boleta', 'Factura') default 'Boleta',
metPago enum('Efectivo', 'Tarjeta', 'Yape', 'Plin', 'Transacción', 'Fiado') not null default 'Efectivo',
observacion varchar(250) null
);

create table detalleVenta(
idDetalle integer primary key not null auto_increment,
idVenta integer not null, foreign key(idVenta) REFERENCES venta(idVenta) ON DELETE CASCADE ON UPDATE CASCADE,
idProducto integer not null, foreign key(idProducto) REFERENCES producto(idProducto) ON DELETE CASCADE ON UPDATE CASCADE, 
cant decimal(6,2) not null default 0,
impSnIgvOExo decimal(8,2) not null default 0,
igv decimal(6,2) not null default 0,
impMasIgv decimal(8,2) not null default 0,
descProdu decimal(6,2) not null default 0,
subtotCnDesc decimal(8,2) not null default 0
);

create table inventario(
idInventario integer primary key not null auto_increment,
idProducto integer not null, foreign key (idProducto) references producto(idProducto) ON DELETE CASCADE ON UPDATE CASCADE,
ubicacion varchar(80) not null, 
stockProducto integer not null default 0,
stockMinimo integer null default 0
);
```

## References

### Project Data
![image](https://github.com/user-attachments/assets/cc4e79c0-06fc-438f-94c9-d0495c1a62a9)

<br/>
This project uses data from [Open Food Facts](https://world.openfoodfacts.org), an open database of food products.  
The data is available under the [Open Database License (ODbL)](https://opendatacommons.org/licenses/odbl/).  

### Icons
<a target="_blank" href="https://icons8.com/icon/32244/barcode-reader">Escáner de código de barras 2 Filled</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a> </br>
<a target="_blank" href="https://icons8.com/icon/6483/multiply">X</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/85458/minus">Menos</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/38033/full-screen">Full Screen</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/10421/pdf">PDF</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/11594/microsoft-excel">MS Excel</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/63262/checkmark">Comprobado</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
<a target="_blank" href="https://icons8.com/icon/rmf1Fvj5nBib/close-window">X</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a></br>
