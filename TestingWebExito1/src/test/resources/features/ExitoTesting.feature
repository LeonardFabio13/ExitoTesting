#language: es
Característica: Agregar articulos al carrito de compras

  Escenario: Agregar productos al carrito de compras
    Dado que entro a la pagina de Exito
    Cuando hago click en el botn de menu
    Y seleciono la categoria dormitorio
    Y seleciono la sub-categoria Cabecera
    Y seleciono el producto "Cabecero Flotante Tatooine Cama King 200 X 60 Negro"
    Y agrego al carrito dos unidades
    Y vuelvo a seleccionar otro porducto que es "Cabecero Entero Estoper Cama Doble 140 X 120 Negro"
    Y agrego al carrito cinco unidades
    Y vuelvo a seleccionar el tercer porducto que se "Cabecero En Ecocuero Negro De 120"
    Y agrego al carrito nueve unidades
    Y vuelvo a seleccionar el cuarto porducto que se "Cabecero Paneles Cama Doble Rosa"
    Y agrego al carrito tres unidades
    Y vuelvo a seleccionar el quinto porducto que se "Cabecera Doble Phoenix Teca"
    Y agrego al carrito cuatro unidades
    Entonces hago clicl en el carrito para ver todo mis producto
    Y valido que esten las "2" unidades del producto "Cabecera Doble Phoenix Teca"
    Y valido que esten las "5" unidades del producto "Cabecera Líbano Blanco/Salmón"
    Y valido que esten las "9" unidades del producto "Cabecero De Cama Doble Cuadro 140 X 60 Negro"
    Y valido que esten las "3" unidades del producto "Espaldar De Piso 140 X 120"
    Y valido que esten las "4" unidades del producto "Cabecero Paneles Cama Doble Rosa"
    Y al pagar por todos mis productos me sale un "9.100.330"