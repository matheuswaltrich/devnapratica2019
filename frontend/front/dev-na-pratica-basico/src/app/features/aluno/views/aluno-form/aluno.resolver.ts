import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from 'src/app/core/entities/aluno/aluno';
import { AlunoService } from 'src/app/core/entities/aluno/aluno.service';


@Injectable()
export class AlunoResolver implements Resolve<Aluno []> {

    constructor(private service: AlunoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
