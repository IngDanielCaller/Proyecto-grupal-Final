# Teoría sobre Unit Testing

## ¿Qué es un Unit Test?

Un **Unit Test** (o prueba unitaria) es una pequeña parte del código que se usa para **verificar que una función o método funcione correctamente**.  
La idea es probar las unidades más pequeñas del programa (como funciones o clases) de manera aislada, sin depender de otras partes del sistema.

*Otras personas lo pueden definir de otra manera:*

**Testear los casos de uso, falseando los datos externo/local para agilizar tiempos de ejecucion y confiabilidad.**

En otras palabras, se trata de comprobar que **cada pieza del programa hace exactamente lo que debe hacer**.

---

## ¿Cómo usar Unit Tests?

La forma de usar pruebas unitarias depende del lenguaje y del framework que uses.  
Veamos dos ejemplos: uno en **Java (JUnit)** y otro en **Python (unittest)**.

*Debes saber que cada lenguaje de programción tiene su propia documentación de como implementar los unit test en ese lenguaje(valga la redundancia), contempla siempre leer la documentación oficial de cada lenguaje*

---

### Ejemplo en Java con JUnit 5

#### Archivo: `Calculadora.java`
```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
}
```
#### Archivo: `CalculadoraTest.java`
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {


    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(0, calc.sumar(-1, 1));
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(-3, calc.restar(2, 5));
    }
}
```
### Ejemplo en Python 

#### Archivo: `calculadora.py`

```
def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

```
#### Archivo: `test_calculadora.py`

```
import unittest
from calculadora import sumar, restar

class TestCalculadora(unittest.TestCase):

    def test_sumar(self):
        self.assertEqual(sumar(2, 3), 5)
        self.assertEqual(sumar(-1, 1), 0)

    def test_restar(self):
        self.assertEqual(restar(3, 2), 1)
        self.assertEqual(restar(2, 5), -3)

if __name__ == "__main__":
    unittest.main()

```
## ¿Por qué usar Unit Tests?

Usar pruebas unitarias tiene varios beneficios importantes:

- **Detectar errores temprano:** ayuda a encontrar fallos en el código antes de que lleguen a producción.  
- **Facilita los cambios:** si modificas tu código, las pruebas te dicen si algo se rompió.  
- **Documenta el comportamiento del programa:** otros programadores pueden ver qué se espera que haga tu función.  
- **Aumenta la confianza:** cuando tus tests pasan, sabes que tu código funciona como se espera.

Ejemplo:
> Si tienes una función que suma dos números, puedes crear un test que verifique que `sumar(2, 3)` devuelve `5`.  
> Si un día cambias algo y el resultado ya no es 5, el test te avisará.

---

### ¿Cuándo usar Unit Testing?

- Durante el desarrollo de nuevas funciones o clases.
- Al corregir errores para asegurarse de que no regresen.
- Al refactorizar código para validar que siga funcionando.
- Para funciones críticas o con lógica compleja.

- Probar al menos las funciones más importantes.
- Cubrir casos normales, límites y posibles errores.
- No es necesario probar cosas triviales, como getters/setters simples.
- Se recomienda alcanzar una **cobertura de código de 70-90%** para mantener calidad sin exagerar.
