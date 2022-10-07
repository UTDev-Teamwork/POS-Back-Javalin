package mx.edu.utdev.api;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import mx.edu.utdev.repository.UnidadMedidaRepository;

public class UnidadMedidaController implements CrudHandler {

    private UnidadMedidaRepository repository;

    public UnidadMedidaController() {
        repository = new UnidadMedidaRepository();
    }

    @Override
    public void create(Context ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getAll(Context ctx) {
        ctx.json(repository.findAll());
    }

    @Override
    public void getOne(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Context ctx, String id) {
        // TODO Auto-generated method stub

    }

}