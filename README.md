# LlanquihueTourApp — Semana 6

## Objetivo
Crear una jerarquía de clases usando herencia simple para modelar servicios turísticos (atributos heredados, sobreescritura de métodos y composición mínima). Mostrar objetos de prueba desde el programa principal.

## Clases creadas
- model.ServicioTuristico: atributos `nombre`, `duracionHoras`.
- model.RutaGastronomica: extiende ServicioTuristico; atributo `numeroDeParadas`.
- model.PaseoLacustre: extiende ServicioTuristico; atributo `tipoEmbarcacion`.
- model.ExcursionCultural: extiende ServicioTuristico; atributo `lugarHistorico`.
- data.GestorServicios: crea instancias de prueba (al menos 2 por subclase).
- ui.Main: ejecuta el programa y muestra los objetos usando `toString()` sobrescrito.

Cada subclase usa `super(...)` en su constructor y sobrescribe `toString()` para mostrar información completa.

## Ejecutar
Desde la raíz del proyecto (carpeta `Semana_6`):

1. Compilar:
   mkdir -p bin
   javac -d bin src/model/*.java src/data/*.java src/ui/*.java

2. Ejecutar:
   java -cp bin ui.Main

(Opcional: usar un IDE como Eclipse o IntelliJ y ejecutar `ui.Main`.)

## Notas
No se usan colecciones ni `instanceof` en esta actividad; el foco es la herencia y la sobreescritura de métodos.
