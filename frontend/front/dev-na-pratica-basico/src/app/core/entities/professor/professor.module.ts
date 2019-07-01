import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ProfessorService } from './professor.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'professor',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/professor`,
            },
        ]),
    ],
    providers: [
      ProfessorService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class ProfessorModule {}
