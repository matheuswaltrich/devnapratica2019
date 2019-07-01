import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Turma } from 'src/app/core/entities/turma/turma';
import { TurmaService } from 'src/app/core/entities/turma/turma.service';


@Injectable()
export class TurmaResolver implements Resolve<Turma []> {

    constructor(private service: TurmaService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}