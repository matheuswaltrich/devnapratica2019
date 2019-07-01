import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { MateriaService } from './materia.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'materia',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/materia`,
            },
        ]),
    ],
    providers: [
      MateriaService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class MateriaModule {}
