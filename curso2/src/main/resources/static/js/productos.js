// Call the dataTables jQuery plugin
$(document).ready(function() {
   cargarProductos();
  $('#productos').DataTable();
});


async function cargarProductos(){

  const request = await fetch('productos', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const productos = await request.json();

    let listadoHtml = '';
    for (let producto of productos){
      console.log(productos);

            let productoHtml = '<tr><td>'
                                + producto.codigoBarras +'</td><td> '
                                + producto.idProducto + '</td><td>'
                                + producto.nombre + '</td><td>'
                                + producto.idCategoria+'</td><td>'
                                + producto.precioVenta +'</td><td> '
                                + producto.cantidadStock +'</td><td> '
                                + producto.estado
                                + ' </td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'

            listadoHtml += productoHtml;
    }
  document.querySelector('#productos tbody').outerHTML = listadoHtml

}