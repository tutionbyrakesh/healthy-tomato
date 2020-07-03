package com.howtodoinjava.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
 * access using : https://localhost:8444/v1/bdbs/1
 */
@RestController
@RequestMapping(path = "/v1/bdbs")
public class JsonResponseController 
{
    @GetMapping(path="/1", produces = "application/json")
    public @ResponseBody String so() {
    	String jsonStr = "{\r\n    \"acl\": [],\r\n    \"aof_policy\": \"appendfsync-every-sec\",\r\n    \"authentication_admin_pass\": \"xxxxxxxxxxxxxxxxxxxxxxx\",\r\n    \"authentication_redis_pass\": \"xxxxxxxx\",\r\n    \"authentication_sasl_pass\": \"\",\r\n    \"authentication_sasl_uname\": \"\",\r\n    \"authentication_ssl_client_certs\": [],\r\n    \"authentication_ssl_crdt_certs\": [],\r\n    \"auto_upgrade\": false,\r\n    \"background_op\": [\r\n        {\r\n            \"status\": \"idle\"\r\n        }\r\n    ],\r\n    \"backup\": false,\r\n    \"backup_failure_reason\": \"\",\r\n    \"backup_history\": 0,\r\n    \"backup_interval\": 0,\r\n    \"backup_interval_offset\": 0,\r\n    \"backup_progress\": 0.0,\r\n    \"backup_status\": \"\",\r\n    \"bigstore\": false,\r\n    \"bigstore_ram_size\": 0,\r\n    \"crdt\": false,\r\n    \"crdt_causal_consistency\": false,\r\n    \"crdt_config_version\": 0,\r\n    \"crdt_ghost_replica_ids\": \"\",\r\n    \"crdt_guid\": \"\",\r\n    \"crdt_replica_id\": 0,\r\n    \"crdt_replicas\": \"\",\r\n    \"crdt_sources\": [],\r\n    \"crdt_sync\": \"disabled\",\r\n    \"created_time\": \"2019-06-07T19:23:32Z\",\r\n    \"data_persistence\": \"disabled\",\r\n    \"dataset_import_sources\": [],\r\n    \"dns_address_master\": \"\",\r\n    \"email_alerts\": false,\r\n    \"endpoints\": [\r\n        {\r\n            \"addr\": [\r\n                \"IP\"\r\n            ],\r\n            \"addr_type\": \"external\",\r\n            \"dns_name\": \"DNS Name\",\r\n            \"port\": 10270\r\n        }\r\n    ],\r\n    \"enforce_client_authentication\": \"enabled\",\r\n    \"eviction_policy\": \"volatile-lru\",\r\n    \"gradual_src_max_sources\": 1,\r\n    \"gradual_src_mode\": \"disabled\",\r\n    \"gradual_sync_max_shards_per_source\": 1,\r\n    \"gradual_sync_mode\": \"auto\",\r\n    \"group_uid\": 0,\r\n    \"hash_slots_policy\": \"16k\",\r\n    \"implicit_shard_key\": false,\r\n    \"import_failure_reason\": \"\",\r\n    \"import_progress\": 0.0,\r\n    \"import_status\": \"\",\r\n    \"last_changed_time\": \"2019-12-04T11:35:09Z\",\r\n    \"max_aof_file_size\": 322122547200,\r\n    \"max_aof_load_time\": 3600,\r\n    \"max_connections\": 0,\r\n    \"memory_size\": 21474836480,\r\n    \"module_list\": [],\r\n    \"name\": \"rpaweb\",\r\n    \"oss_cluster\": false,\r\n    \"oss_cluster_api_preferred_ip_type\": \"internal\",\r\n    \"port\": 0,\r\n    \"proxy_policy\": \"single\",\r\n    \"rack_aware\": false,\r\n    \"redis_version\": \"5.0\",\r\n    \"replica_sources\": [],\r\n    \"replica_sync\": \"disabled\",\r\n    \"replication\": true,\r\n    \"shard_key_regex\": [],\r\n    \"shard_list\": [\r\n        1,\r\n        2\r\n    ],\r\n    \"sharding\": false,\r\n    \"shards_count\": 1,\r\n    \"shards_placement\": \"dense\",\r\n    \"skip_import_analyze\": \"disabled\",\r\n    \"slave_ha\": true,\r\n    \"slave_ha_priority\": 0,\r\n    \"snapshot_policy\": [],\r\n    \"ssl\": false,\r\n    \"status\": \"active\",\r\n    \"sync\": \"disabled\",\r\n    \"sync_sources\": [],\r\n    \"tls_mode\": \"disabled\",\r\n    \"type\": \"redis\",\r\n    \"uid\": 1,\r\n    \"version\": \"5.0.4\",\r\n    \"wait_command\": true\r\n}";
        return jsonStr;
    }
}
