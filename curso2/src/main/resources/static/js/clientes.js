// Call the dataTables jQuery plugin
$(document).ready(function() {
   cargarClientes();
  $('#clientes').DataTable();
});


async function cargarClientes(){

  const request = await fetch('clientes', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const clientes = await request.json();

    let listadoHtml = '';
    for (let cliente of clientes){
      console.log(clientes);

            let clienteHtml = '<tr><td>'
                                + cliente.id + '</td><td>'
                                + cliente.nombre + '</td><td>'
                                + cliente.apellidos+'</td><td>'
                                + cliente.celular +'</td><td> '
                                + cliente.direccion +'</td><td> '
                                + cliente.correoElectronico
                                + ' </td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'

            listadoHtml += clienteHtml;
    }
  document.querySelector('#clientes tbody').outerHTML = listadoHtml

}