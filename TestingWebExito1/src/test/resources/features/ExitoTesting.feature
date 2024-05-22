#language: es
Característica: Agregar articulos al carrito de compras

  Escenario: Agregar productos al carrito de compras
    Dado que entro a la pagina de Exito
    Cuando hago click en el botn de menu
    Y seleciono la categoria dormitorio
    Y seleciono la sub-categoria Cabecera
    Y seleciono el producto "Cabecero Para Cama Doble Dublin Café"
    Y agrego al carrito dos unidades
    Y vuelvo a seleccionar otro porducto que es "Cabecera Líbano Blanco/Salmón"
    Y agrego al carrito cinco unidades
    Y vuelvo a seleccionar el tercer porducto que se "Cabecero De Cama Doble Cuadro 140 X 60 Negro"
    Y agrego al carrito nueve unidades
    Y vuelvo a seleccionar el cuarto porducto que se "Cabecero Para Cama Doble Dublin Gris"
    Y agrego al carrito tres unidades
    Y vuelvo a seleccionar el quinto porducto que se "Cabecero Paneles Cama Doble Rosa"
    Y agrego al carrito cuatro unidades
    Entonces hago clicl en el carrito para ver todo mis producto
    Y al pagar por todos mis productos me sale un "Total: $ 7.471.150"