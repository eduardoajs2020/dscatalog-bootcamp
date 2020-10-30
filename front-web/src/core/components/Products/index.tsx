import List from 'pages/Admin/components/List';
import React from 'react';
import { Route, Switch } from 'react-router-dom';



const Products = () => {
    return (
        <div>
            <Switch>
                <Route path="/admin/products" exact>
                    <List />
                </Route>
                <Route path="/admin/products/create">
                    <h1>Criar novo produto</h1>
                </Route>
                <Route path="/admin/products/:productId">
                    <h1>Editar um produto</h1>
                </Route>
            </Switch>
        </div>
    );

}

export default Products;
