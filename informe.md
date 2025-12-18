# INFORME — EJERCICIO 1 Y EJERCICIO 2

---

# EJERCICIO 1 — Cálculo de la constante k y su error

## 1) Fórmulas usadas

Pendiente k (método de mínimos cuadrados):

    k = SUMA[(xi - x_prom) * (Fi - F_prom)]  /  SUMA[(xi - x_prom)^2]

Error de la pendiente (sigma_k):

    sigma_k =  sqrt( SUMA[(Fi - k*xi)^2] / (N - 2) )  /  sqrt( SUMA[(xi - x_prom)^2] )

---

## 2) Datos usados

Masas (kg): 0.050, 0.100, 0.150, 0.200, 0.250  
Fuerzas F = m*g (con g=9.81):

    F = [0.4905, 0.9810, 1.4715, 1.9620, 2.4525]  (N)

Elongaciones x (m):

    x = [0.012, 0.024, 0.036, 0.049, 0.061]

---

## 3) Cálculos

Promedios:

    x_prom = 0.0364
    F_prom = 1.4715

Suma de productos:

    SUMA[(xi - x_prom)*(Fi - F_prom)] = 0.06033150

Suma de cuadrados:

    SUMA[(xi - x_prom)^2] = 0.00151320

Cálculo de k:

    k = 0.06033150 / 0.00151320
    k = 39.8701427438541  N/m

Cálculo de residuos:

    SUMA[(Fi - k*xi)^2] = 0.0004769830

Cálculo del error sigma_k:

    sigma_k = sqrt( 0.0004769830 / 3 ) / sqrt(0.00151320)
    sigma_k = 0.32414750198255476  N/m

---

## RESULTADO FINAL DEL EJERCICIO 1

    k = 39.8701  ±  0.3241   N/m

---

# EJERCICIO 2 — Período T, su error, y frecuencia angular

## 1) Fórmulas usadas

Período:

    T = 2*pi * sqrt( M / k )

Error de T:

    sigma_T = T * 0.5 * sqrt( (sigma_M / M)^2  +  (sigma_k / k)^2 )

Frecuencia angular:

    omega = 2*pi / T

Error de omega:

    sigma_omega = (2*pi / T^2) * sigma_T

---

## 2) Datos usados

Masa base m0 = 0.050 kg  
Incertidumbre sigma_m0 = 0.001 kg  

Masa usada:

    M = 9*m0 = 0.450 kg
    sigma_M = 9*sigma_m0 = 0.009 kg

Constante del resorte:

    k = 39.87014274  N/m
    sigma_k = 0.32414750 N/m

---

## 3) Cálculos

Período:

    M/k = 0.450 / 39.87014274 = 0.0112866413
    sqrt(M/k) = 0.1062386055
    T = 2*pi * 0.1062386055
    T = 0.6675168454  s

Errores relativos:

    sigma_M / M = 0.009 / 0.450 = 0.02
    sigma_k / k = 0.3241475 / 39.8701427 = 0.0081300813

Error del período:

    sigma_T = T * 0.5 * sqrt( 0.02^2 + 0.0081300813^2 )
    sigma_T = 0.0072056134  s

Frecuencia angular:

    omega = 2*pi / T
    omega = 9.4127741505  rad/s

Error de omega:

    sigma_omega = (2*pi / T^2) * sigma_T
    sigma_omega = 0.1016076404  rad/s

---

# RESULTADOS FINALES DEL EJERCICIO 2

    T = 0.66752  ±  0.00721   s

    omega = 9.41277  ±  0.10161   rad/s

---

# RESUMEN GENERAL

| Magnitud | Resultado |
|----------|-----------|
| k | 39.8701 ± 0.3241 N/m |
| T | 0.66752 ± 0.00721 s |
| omega | 9.41277 ± 0.10161 rad/s |

---
