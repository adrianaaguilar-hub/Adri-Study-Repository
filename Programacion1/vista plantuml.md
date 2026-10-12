@startchen

' Modelo ER Chen del ejercicio

' Entidades principales
entity "Categoría" as Categoria
entity "Vehículo" as Vehiculo
entity "Estación" as Estacion
entity "Cliente" as Cliente
entity "Alquiler" as Alquiler
entity "Pago" as Pago

' Relaciones
relationship "Pertenece a" as Pertenece
relationship "Está ubicado en" as UbicadoEn
relationship "Realiza" as Realiza
relationship "Utiliza" as Utiliza
relationship "Inicia en" as IniciaEn
relationship "Finaliza en" as FinalizaEn
relationship "Registra" as Registra

' Cardinalidades
Categoria -1- Pertenece
Pertenece -N- Vehiculo

Estacion -1- UbicadoEn
UbicadoEn -N- Vehiculo

Cliente -1- Realiza
Realiza -N- Alquiler

Vehiculo -1- Utiliza
Utiliza -N- Alquiler

Estacion -1- IniciaEn
IniciaEn -N- Alquiler

Estacion -1- FinalizaEn
FinalizaEn -N- Alquiler

Alquiler -1- Registra
Registra -N- Pago

/'
Apartado a: algunos atributos significativos (no se dibujan porque el
apartado c solicita el diagrama sin atributos).

Categoría: nombre
Vehículo: matrícula, estado
Estación: zona, capacidad máxima
Cliente: nombre, documento, teléfono, correo
Alquiler: fecha de inicio, fecha de fin, costo, estado
Pago: monto, método, fecha

Restricción temporal del enunciado:
un vehículo puede participar en muchos alquileres a lo largo del tiempo,
pero solo en un alquiler activo simultáneamente.
'/

@endchen