# Rails

Este proyecto Java con Maven consiste en simular una red ferroviaria en la que circulan trenes con diferentes destinos y estaciones.

## Normas

- Los trenes tienen destinados una ruta predeterminada
- Las rutas tienen estaciones y cruces con otras rutas
- Las estaciones pueden pertenecer a varias rutas a la vez
- Los trenes tienen un horario entre estaciones
- Ningún tren puede coincidir con ningún otro tren en un mismo punto (colisión)
- Las rutas tienen sus propios precios de billete y su tiempo de trayecto
- Los trenes permanecen 5 minutos en cada estación antes de salir

## Clases

### - Tren (class)
    - Atributos
        - velocidad (float)
        - ruta (Ruta)
        - codigo (final String)
    - Métodos
        - setVelocidad(float): void
        - getCodigo(): String
        - getRuta(): Ruta
        - toString(): String

### - Ruta (class)
    - Atributos
        - estaciones (List\<Estacion>)
        - distanciaTrayecto (float)
        - precio (float)
        - tiempoEstimado (float)
    - Métodos
        - getEstaciones(): List\<Estacion>
        - getDistanciaTrayecto(): float
        - getPrecio(): float
        - setPrecio(float): void
        - getTiempoEstimado(): float
        - addEstacion(Estacion): void
        - removeEstacion(String): void
        - toString(): String

### - Estacion (class)
    - Atributos
        - nombre (String)
        - codigo (final String)
    - Métodos
        - getNombre(): String
        - getCodigo(): String
        - toString(): String