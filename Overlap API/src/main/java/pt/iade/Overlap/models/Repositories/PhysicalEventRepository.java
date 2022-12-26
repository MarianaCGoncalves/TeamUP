package pt.iade.Overlap.models.Repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pt.iade.Overlap.models.PhysicalEvent;
import pt.iade.Overlap.models.views.PhysicalEventEveView; 
 
public interface PhysicalEventRepository extends CrudRepository<PhysicalEvent,Integer> {


    String getAllInfoPhysicalEvents = "select use_name as username, gru_id as groupid, gru_use_id as usergroupid, gru_name as groupname, gru_desc as groupdescription, "
    +"gru_create_age as groupbd, gru_last_post_age as lastpost, gru_at as activity, ug_id as usergroupid, "
    +"ug_gru_id as userggroupid, ug_use_id as uusergroup_id, eve_id as eventid, eve_name as eventname, "
    +"eve_ug_id as eventusergroupid, eve_desc as description, eve_date as eventtimestamp, "
    +"eve_evt_id as eventtype, eve_phy_ug_id as eventphysicalusergroupid, eve_phy_dt as eventdate, "
    +"eve_phy_eve_id as eventphysicaleventid, eve_phylocat_evephy_id as eplepid, locat_id as locationid, "
    +"locat_name as locationname, locat_point as locationcoordinates "
    +"from grupos, usergroup, eventos, evefisico, evephylocat, localizacao "
    +"where gru_id = ug_gru_id and ug_id = eve_ug_id and eve_id = eve_phy_eve_id "
    +"and eve_phylocat_evephy_id = eve_phy_id and eve_phylocat_locat_id = locat_id "
    +"and use_id = ug_use_id";

    @Query(value = getAllInfoPhysicalEvents, nativeQuery = true)
    Iterable<PhysicalEventEveView> getPhysicalEvents();
 } 
