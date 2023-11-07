<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Página de Compra</title>
</head>
<body>
    <h1>Página de Compra</h1>
    <form action="processarCompra" method="post">
        <label for="cliente">Cliente:</label>
        <select name="cliente" id="cliente">
            <option value="1">John Doe</option>
            <option value="2">Jane Smith</option>
            <!-- Preencha dinamicamente os clientes a partir do seu backend -->
        </select>
        <br>
        <label for="destino">Destino:</label>
        <select name="destino" id="destino">
            <option value="1">Paris</option>
            <option value="2">Nova York</option>
            <!-- Preencha dinamicamente os destinos a partir do seu backend -->
        </select>
        <br>
        <button type="submit">Comprar</button>
    </form>
</body>
</html>
